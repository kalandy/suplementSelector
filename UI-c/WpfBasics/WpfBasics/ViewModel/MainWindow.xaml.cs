using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using WpfBasics.Data;
using System.Diagnostics;

namespace WpfBasics
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    /// 
 

    public partial class MainWindow : Window
    {
        SelectedItem selectedItem;

        DataLoader dataLoader = new DataLoader(new HealthProblemsRestClient());

        public MainWindow()
        { 

            selectedItem = dataLoader.LoadData();
            //ustawienie obiektu dla Bindingu
            this.DataContext = selectedItem;

            InitializeComponent();
        }

        private void SuplementComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            selectedItem.SelectedSuplement = ((Suplement)((ComboBox)sender).SelectedValue);

        }

        private void ProblemComboBoxText_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            this.selectedItem.SelectedHealthProblem = (HealthProblem)((ComboBox)sender).SelectedValue;
        }
        private void Hyperlink_RequestNavigate(object sender, RequestNavigateEventArgs e)
        {
            Process.Start(new ProcessStartInfo(e.Uri.AbsoluteUri));
            e.Handled = true;
        }
    }



      
    
}
