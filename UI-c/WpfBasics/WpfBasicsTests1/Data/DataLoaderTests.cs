using Microsoft.VisualStudio.TestTools.UnitTesting;
using WpfBasics.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Moq;
using System.IO;

namespace WpfBasics.Data.Tests
{
    [TestClass()]
    public class DataLoaderTests
    {
       

        [TestMethod()]
        public void DataLoaderTest()
        {
            //given
            Mock<IHealthProblemsRestClient> restMock = new Mock<IHealthProblemsRestClient>();

            DataLoader dataLoader = new DataLoader((IHealthProblemsRestClient)restMock.Object);
            restMock.Setup(x => x.GetHealthProblemsJson()).Returns(@"[
                {
                ""name"": ""Problem1"",
                ""description"": ""opis1"",
                ""suplements"": [
                    {
                    ""name"": ""Suplement1"",
                    ""suplementDescription"": ""opisSupl1"",
                    ""howTo"": ""howTo1"",
                    ""linkUrl"": ""link1""
                    }]
                }]");

            //when
            SelectedItem result = dataLoader.LoadData();

            //then
            Assert.IsNull(result.SelectedHealthProblem);
            Assert.IsNull(result.SelectedSuplement);

            Assert.AreEqual(result.AllHealthProblems.Count, 1);

            HealthProblem healthProblem = result.AllHealthProblems.ElementAt(0);
            Assert.AreEqual(healthProblem.Name, "Problem1");
            Assert.AreEqual(healthProblem.Description, "opis1");
            Assert.AreEqual(healthProblem.Suplements.Count, 1);
            Assert.AreEqual(healthProblem.Suplements.ElementAt(0).Name, "Suplement1");
            Assert.AreEqual(healthProblem.Suplements.ElementAt(0).SuplementDescription, "opisSupl1");
            Assert.AreEqual(healthProblem.Suplements.ElementAt(0).LinkUrl, "link1");
            Assert.AreEqual(healthProblem.Suplements.ElementAt(0).HowTo, "howTo1");

        }
    }
}