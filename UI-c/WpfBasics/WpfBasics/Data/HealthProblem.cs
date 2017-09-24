using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace WpfBasics.Data
{
    public class HealthProblem : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public HealthProblem()
        {
            Suplements = new List<Suplement>();
        }

        public String Name
        {
            get;
            set;
        }

        public String Description
        {
            get;
            set;
        }

        public String Cause
        {
            get;
            set;
        }

        public List<Suplement> Suplements
        {
            get;
            set;
        }

        public override string ToString()
        {
            return Name;
        }
    }

    public class Suplement : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public String Name
        {
            get;
            set;
        }

        //TODO: dodac reszte pol

        public override string ToString()
        {
            return Name;
        }
    }
}
