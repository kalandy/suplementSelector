﻿using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfBasics.Data
{
    /*!
* \brief Klasa HealthProblemRestClient, utworzenie Resta, połączenie z serwerem Javy
*        
* http://restsharp.org/
*/
    public class HealthProblemsRestClient : IHealthProblemsRestClient
    {
        //http://restsharp.org/
        //zobaczenie ip do hosta - ipconfig /all
        // http://10.0.2.2:8080  adres serwera JAVovego, musi być włączony http://ec2-52-14-145-69.us-east-2.compute.amazonaws.com:8080/
        RestClient restClient = new RestClient("http://ec2-52-14-145-69.us-east-2.compute.amazonaws.com:8080/");
        RestRequest restRequest = new RestRequest("healthProblems", Method.GET);


        public string GetHealthProblemsJson()
        {   /*!< pobranie JSON'a */

            return restClient.Execute(restRequest).Content;
        }
    }
}