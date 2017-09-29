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
            Mock<IHealthProblemsRestClient> restMock = new Mock<IHealthProblemsRestClient>();

            DataLoader dataLoader = new DataLoader((IHealthProblemsRestClient)restMock.Object);
            restMock.Setup(x => x.LoadData()).Returns(@"");

            var result = dataLoader.LoadData();



            Assert.Fail();
        }

        [TestMethod()]
        public void LoadDataTest()
        {
            Assert.Fail();
        }
    }
}