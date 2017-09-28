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
            //HealthProblem healthProblem = new HealthProblem();
            //healthProblem.Name = "Zespół przewlekłego zmęczenia";
            //healthProblem.Description = "Zespół przewlekłego zmęczenia (ang. Chronic Fatigue Syndrome, CFS) obecnie jest uznawany za chorobę cywilizacyjną." +
            //    " Cierpią na nią przede wszystkim młode, aktywne kobiety, pracujące zawodowo i opiekujące się dziećmi oraz domem. Zmęczenie polega na tym," +
            //    " że uczucie wyczerpania towarzyszy przez kilka tygodni, mimo długiego wypoczynku. Chroniczne zmęczenie ogranicza aktywność człowieka o ponad 50%." +
            //    " Objawy przewlekłego zmęczenia występują zarówno u osób zdrowych, jak i cierpiących na choroby somatyczne oraz niektóre zaburzenia psychiczne.";
            //healthProblem.Cause = "Jakas przyczyna";

            //Suplement suplement = new Suplement();
            //suplement.Name = "Ashwagandha";
            //suplement.ChosenSuplement = suplement.Name;
            //suplement.SuplementDescription = "opis";
            //suplement.HowTo = "3 razy dziennie po 600mg";
            //suplement.LinkUrl = "www.muscle-zone.pl/ashwa";

            //Suplement suplement1 = new Suplement();
            //suplement1.Name = "Rhodiola";
            //suplement1.ChosenSuplement = suplement1.Name;
            //suplement1.SuplementDescription = "opis1";
            //suplement1.HowTo = "3 razy dziennie po 500mg";
            //suplement1.LinkUrl = "www.muscle-zone.pl/rhodiola";



            //healthProblem.Suplements = new List<Suplement>(new Suplement[] { suplement, suplement1 });


            ////TODO: DOdac obiekty

            //HealthProblem healthProblem1 = new HealthProblem();
            //healthProblem1.Name = "Słaby sen";
            //healthProblem1.Description = "bla";
            //healthProblem1.Cause = "abl";

            //Suplement suplement3 = new Suplement();
            //suplement3.Name = "5-HTP";
            //suplement3.ChosenSuplement = suplement3.Name;
            //suplement3.SuplementDescription = "opis3";
            //suplement3.HowTo = "3 razy dziennie po 400mg";
            //suplement3.LinkUrl = "www.muscle-zone.pl/5-htp";


            //Suplement suplement4 = new Suplement();
            //suplement4.Name = "GABA";
            //suplement4.ChosenSuplement = suplement4.Name;
            //suplement4.SuplementDescription = "opis4";
            //suplement4.HowTo = "3 razy dziennie po 1 tabletce";
            //suplement4.LinkUrl = "www.muscle-zone.pl/gaba";


            //healthProblem1.Suplements = new List<Suplement>(new Suplement[] { suplement3, suplement4 });

            //http://restsharp.org/

            //selectedItem = new SelectedItem();
            //selectedItem.AllHealthProblems = new List<HealthProblem>(new HealthProblem[] { healthProblem, healthProblem1 });

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

        private void OpisDolegliwosciTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void PrzyczynyTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }
      
        private void OpisSuplementuTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void StosowanieTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

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
