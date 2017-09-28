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
    /*!
* \brief Klasa SelectedItem,biblioteka Fody, obsługa PropertyChanged
*        
* FodyWeavers notifypropertychanged
*/
    public class SelectedItem  : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged; /*!< tu używałem bilbioteki Fody */

        public SelectedItem()
        {
            SelectedHealthProblem = new HealthProblem();
            SelectedSuplement = new Suplement();
        }

        public HealthProblem SelectedHealthProblem /*!< pobieranie i ustawianie wartości wybranego problemu zdrowotnego */
        {
            get;
            set;
        }

        public Suplement SelectedSuplement /*!< pobieranie i ustawianie wartości wybranego suplementu */
        {
            get;
            set;
        }

        public List<HealthProblem> AllHealthProblems /*!< pobieranie i ustawianie wartości listy all */
        {
            get;
            set;
        }

    }
}
