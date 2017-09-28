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

        public MainWindow()
        {
            //http://restsharp.org/
            //zobaczenie ip do hosta - ipconfig /all
            RestClient restClient =  new RestClient("http://10.0.2.2:8080" /* adres serwera JAVovego, musi być włączony*/);
            RestRequest restRequest = new RestRequest("healthProblems", Method.GET);

            //pobranie JSON'a
            var healthProblemsString = restClient.Execute(restRequest).Content;

            //Konwersja JSON'a na obiekt z C#
            List<HealthProblem> healthProblems = JsonConvert.DeserializeObject<List<HealthProblem>>(healthProblemsString);

          
            selectedItem = new SelectedItem();
            selectedItem.AllHealthProblems = new List<HealthProblem>(healthProblems);

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
