using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfBasics.Data
{

  

    public class DataLoader
    {
        IHealthProblemsRestClient healthProblemsRest;

        public DataLoader(IHealthProblemsRestClient healthProblemsRestClient)
        {
            this.healthProblemsRest = healthProblemsRestClient;
        }

        public SelectedItem LoadData()
        {
            var healthProblemsString = healthProblemsRest.LoadData();

            //Konwersja JSON'a na obiekt z C#
            List<HealthProblem> healthProblems = JsonConvert.DeserializeObject<List<HealthProblem>>(healthProblemsString);

            //ustawienie danych dla UI
            SelectedItem selectedItem = new SelectedItem();
            selectedItem.AllHealthProblems = new List<HealthProblem>(healthProblems);

            return selectedItem;
        }
    }

}

