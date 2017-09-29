using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfBasics.Data
{

    /*!
  * \brief Klasa DataLoader, pobieranie danych
  *        
  * ustawienie obiektu dla Bindingu, utworzenie dataLoader
  */

    public class DataLoader
    {
        IHealthProblemsRestClient healthProblemsRest;

        public DataLoader(IHealthProblemsRestClient healthProblemsRestClient)
        {
            this.healthProblemsRest = healthProblemsRestClient;
        }

        /*!
* \brief metoda LoadData - wczytanie danych
*        
*Konwersja JSON'a na obiekt z C#, ustawienie danych dla UI
*/
        public SelectedItem LoadData()
        {
            var healthProblemsString = healthProblemsRest.GetHealthProblemsJson();

            //Konwersja JSON'a na obiekt z C#
            List<HealthProblem> healthProblems = JsonConvert.DeserializeObject<List<HealthProblem>>(healthProblemsString);

            //ustawienie danych dla UI
            SelectedItem selectedItem = new SelectedItem();
            selectedItem.AllHealthProblems = new List<HealthProblem>(healthProblems);
            selectedItem.SelectedHealthProblem = null;
            selectedItem.SelectedSuplement = null;

            return selectedItem;
        }
    }

}

