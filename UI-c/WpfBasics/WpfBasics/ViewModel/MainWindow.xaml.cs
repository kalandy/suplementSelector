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
            HealthProblem healthProblem = new HealthProblem();
            healthProblem.Name = "Zespół przewlekłego zmęczenia";
            healthProblem.Description = "Zespół przewlekłego zmęczenia (ang. Chronic Fatigue Syndrome, CFS) obecnie jest uznawany za chorobę cywilizacyjną." +
                " Cierpią na nią przede wszystkim młode, aktywne kobiety, pracujące zawodowo i opiekujące się dziećmi oraz domem. Zmęczenie polega na tym," +
                " że uczucie wyczerpania towarzyszy przez kilka tygodni, mimo długiego wypoczynku. Chroniczne zmęczenie ogranicza aktywność człowieka o ponad 50%." +
                " Objawy przewlekłego zmęczenia występują zarówno u osób zdrowych, jak i cierpiących na choroby somatyczne oraz niektóre zaburzenia psychiczne.";
            healthProblem.Cause = "Jakas przyczyna";

            Suplement suplement = new Suplement();
            suplement.Name = "Ashwagandha";


            healthProblem.Suplements = new List<Suplement>(new Suplement[] { suplement, suplement });


            selectedItem = new SelectedItem();
            selectedItem.AllHealthProblems = new List<HealthProblem>(new HealthProblem[] { healthProblem });
        

            //TODO: DOdac obiekty




            this.DataContext = selectedItem;


            InitializeComponent();
        }

        private void SuplementComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            selectedItem.SelectedSuplement = ((Suplement)((ComboBox)sender).SelectedValue);

        }

        private void ComboBoxItem_Selected(object sender, RoutedEventArgs e)
        {
            this.OpisDolegliwosciTextBox.Text = "Zespół przewlekłego zmęczenia (ang. Chronic Fatigue Syndrome, CFS) obecnie jest uznawany za chorobę cywilizacyjną." +
                " Cierpią na nią przede wszystkim młode, aktywne kobiety, pracujące zawodowo i opiekujące się dziećmi oraz domem. Zmęczenie polega na tym," +
                " że uczucie wyczerpania towarzyszy przez kilka tygodni, mimo długiego wypoczynku. Chroniczne zmęczenie ogranicza aktywność człowieka o ponad 50%." +
                " Objawy przewlekłego zmęczenia występują zarówno u osób zdrowych, jak i cierpiących na choroby somatyczne oraz niektóre zaburzenia psychiczne.";

            this.PrzyczynyTextBox.Text = "Istnieje kilka przyczyn zespołu chronicznego zmęczenia, do których można zaliczyć:zbyt szybkie tempo" +
                " życia, stres,życie pod ciągłą presją,małą ilość snu i brak odpoczynku,nadodpowiedzialność," +
                "osobowość typu WZA,złą dietę,tzw. „wyścig szczurów”. ";


           
        }

        private void ComboBoxItem_Selected_1(object sender, RoutedEventArgs e)
        {
            this.OpisDolegliwosciTextBox.Text = "Mało nasilone, trwające do kilku dni zaburzenia snu występują powszechnie." +
                " Trudności w zasypianiu, niespokojny sen, budzenie się w nocy, uczucie niewyspania i złe samopoczucie w ciągu dnia – to wszystko mogło przydarzyć się każdemu z nas." +
                " Tego rodzaju zaburzenia snu mają za swoją przyczynę stres i związane z nim silne emocje jak złość, obawy, rozczarowania i radości.";


            this.PrzyczynyTextBox.Text = "Pierwszą, oczywistą, ale też najpowszechniejszą przyczyną takiego stanu" +
                " rzeczy jest niewystarczająca ilość przespanych godzin w ciągu nocy. ";
        }

        private void OpisDolegliwosciTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void PrzyczynyTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void Suplement1_Selected(object sender, RoutedEventArgs e)
        {
            this.OpisSuplementuTextBox.Text = "Najnowsze badania określają Ashwagandhę jako roślinę" +
                " o właściwościach adaptogennych dzięki zawartości substancji o działaniu farmakologicznym.";

            this.StosowanieTextBox.Text = "2 razy dziennie po 400mg";

            this.LinkTextblock.Text = "http://www.muscle-zone.pl/adaptogeny/apollos-ashwagandha-60-kaps";
}

        private void Suplement2_Selected(object sender, RoutedEventArgs e)
        {
            this.OpisSuplementuTextBox.Text = " Odpowiednia dawka ziela Gotu Kola potrafi pomóc przy żylakach, słabej pamięci," +
                " trudno gojących się ranach, a także zmniejsza powstawanie blizn i cellulitu.";

            this.StosowanieTextBox.Text = "2 razy dziennie po 500mg";

            this.LinkTextblock.Text = "http://www.muscle-zone.pl/adaptogeny/gotu-kola-double-extract-100-kaps";
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
    }



      
    
}
