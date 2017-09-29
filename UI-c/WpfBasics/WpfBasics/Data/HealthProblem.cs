using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace WpfBasics.Data
{
    /*!
* \brief Klasa HealthProblem, deklaracja składowych
*        
* gettey i settery
*/
    public class HealthProblem : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public HealthProblem()
        {
            Suplements = new List<Suplement>();
        }

        public String Name /*!< pobieranie i ustawianie wartości składowej nazwa problemu */
        {
            get;
            set;
        }

        public String Description /*!< pobieranie i ustawianie wartości skladowej opis problemu */
        {
            get;
            set;
        }

        public String Cause /*!< pobieranie i ustawianie wartości składowej przyczyny problemu */
        {
            get;
            set;
        }

        public List<Suplement> Suplements /*!< pobieranie i ustawianie składowej listy suplementów */
        {
            get; 
            set;
        }

        public override string ToString() /*!< przeładowanie metody */
        {
            return Name; /*!< zwraca nazwe problemu */
        }
    }

    /*!
* \brief Klasa Suplement, deklaracja składowych
*        
* gettey i settery
*/
    public class Suplement : INotifyPropertyChanged /*!< korzystanie z biblioteki Inotify */
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public String Name /*!< pobieranie i ustawianie wartości składowej nazwa suplementu */
        {
            get;
            set;
        }

        public String ChosenSuplement /*!< pobieranie i ustawianie wartości składowej wybrany suplement */
        {
            get;
            set;
        }

        public String SuplementDescription /*!< pobieranie i ustawianie wartości składowej opis suplementu */
        {
            get;
            set;
        }

        public String HowTo /*!< pobieranie i ustawianie wartości składowej w której opisane jest jak stosować, dawkować suplement */
        {
            get;
            set;
        }

        public String LinkUrl /*!< pobieranie i ustawianie wartości składowej z adresem URL do strony internetowej z ofertą */
        {
            get;
            set;
        }

        public override string ToString() /*!< przeładowanie metody */
        {
            return Name; /*!< zwraca nazwe suplementu */
        }
    }
}
