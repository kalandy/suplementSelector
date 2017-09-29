namespace WpfBasics.Data
{ /*!
* \brief Klasa IHealthProblemRestClient, Interfejs utworzony na potrzeby testów jednostkowych
*      
* , bez Interfejsu nie da się utworzyć Mocka potrzebnego do testów jednostkowych     
*/
    public interface IHealthProblemsRestClient
    {
        string GetHealthProblemsJson();  /*!< pobranie JSON'a */
    }
}