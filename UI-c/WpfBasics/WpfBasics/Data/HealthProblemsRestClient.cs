using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfBasics.Data
{
    public class HealthProblemsRestClient : IHealthProblemsRestClient
    {
        //http://restsharp.org/
        //zobaczenie ip do hosta - ipconfig /all
        RestClient restClient = new RestClient("http://10.0.2.2:8080" /* adres serwera JAVovego, musi być włączony*/);
        RestRequest restRequest = new RestRequest("healthProblems", Method.GET);


        public string GetHealthProblemsJson() {
            //pobranie JSON'a
            return restClient.Execute(restRequest).Content;
        }
    }
}
