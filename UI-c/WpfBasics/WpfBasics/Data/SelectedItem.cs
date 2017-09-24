using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using PropertyChanged;

//FodyWeavers notifypropertychanged
namespace WpfBasics.Data
{
    public class SelectedItem  : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public SelectedItem()
        {
            SelectedHealthProblem = new HealthProblem();
            SelectedSuplement = new Suplement();
        }

        public HealthProblem SelectedHealthProblem
        {
            get;
            set;
        }

        public Suplement SelectedSuplement
        {
            get;
            set;
        }

        public List<HealthProblem> AllHealthProblems
        {
            get;
            set;
        }

    }
}
