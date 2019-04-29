package pl.kalandyk.suplement.selector.test_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.kalandyk.suplement.selector.domain.HealthProblem;
import pl.kalandyk.suplement.selector.domain.Suplement;
import pl.kalandyk.suplement.selector.repository.HealthProblemRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component

public class TestData {

    @Autowired
    private HealthProblemRepository healthProblemRepository; /*!< repozytorium bazy danych - problem zdrowotny */


//    @PostConstruct
//    public void test() {
//        List<HealthProblem> healthProblems = new ArrayList<>();
//        initHealthProblems(healthProblems);
//        healthProblemRepository.save(healthProblems);
//        System.out.println();
//    }

    public static void main(String[] args) {
        List<HealthProblem> healthProblems = new ArrayList<>();
        initHealthProblems(healthProblems);
        System.out.println();
    }

    private static void initSuplements(List<Suplement> suplements) {
        Suplement suplement1 = new Suplement();
        suplement1.setName("Tyrozyna");
        suplement1.setSuplementDescription(
                "Tyrozyna jest aminokwasem endogennym – oznacza to, że organizm potrafi ją sam zsyntetyzować. " +
                        "Substancja ta pełni przede wszystkim funkcję prekursora neuroprzekaźników dopaminy i " +
                        "noradrenaliny oraz hormonów tarczycy.Niski poziom tyrozyny może być przyczyną długotrwałego " +
                        "stresu i objawiać się w postaci zmęczenia, spadku funkcji poznawczych, pogorszenia nastroju " +
                        "oraz zmniejszenia zdolności do zapamiętywania. Wykazano, że suplementacja preparatów " +
                        "zawierających tyrozynę wpływa korzystnie stan umysłu, poprawia nastrój, koncentrację, " +
                        "zwiększa uwagę oraz odporność na stres.");
        suplement1.setHowTo(
                "Zwyczajowo poleca się stosowanie od 100 do 150 mg preparatu na każdy kilogram masy ciała. Niemniej " +
                        "jednak warto pamiętać, że suplementacja tyrozyną w dozach powyżej 10 g może okazać się zbyt " +
                        "silna w działaniu.");
        suplement1.setLinkUrl("http://www.muscle-zone.pl/boostery-mozgu/stymulanty/tyrozyna");

        Suplement suplement2 = new Suplement();
        suplement2.setName("Fenyloetyloamina (PEA)");
        suplement2.setSuplementDescription(
                "Fenyloetyloamina (PEA) jest aminą występująca w niewielkich ilościach w organizmie człowieka " +
                        "(głównie w mózgu), syntetyzowaną z egzogennego aminokwasu – fenyloalaniny. Związek ten " +
                        "odpowiedzialny jest za pobudzanie wydzielania noradrenaliny i dopaminy, dzięki czemu wywiera" +
                        " korzystny efekt zarówno w sferze funkcji poznawczych, jak i tych związanych z nastrojem, " +
                        "uczuciami i odczuwaniem przyjemności.");
        suplement2.setHowTo(
                "Akceptowalna dawka PEA oscyluje między 250 a 500 mg dziennie. Dawka powyżej 1000 mg jest niewskazana" +
                        ". Nowym użytkownikom zaleca się stosowanie na samym początku dawek 100 mg dziennie i " +
                        "zwiększać je w miarę potrzeb i odczuwanych skutków działania suplementu. ");
        suplement2.setLinkUrl("http://www.muscle-zone.pl/boostery-mozgu/stymulanty/pea-i-pochodne");

        Suplement suplement3 = new Suplement();
        suplement3.setName("L-Dopa ");
        suplement3.setSuplementDescription(
                "L-DOPA, zwana też lewodopą, jest aminokwasem, pochodną tyrozyny. W mózgu wytwarzana jest z niej " +
                        "dopamina – neuroprzekaźnik niezbędny do prawidłowego funkcjonowania organizmu.Lewodopa " +
                        "dobrze wchłania się z przewodu pokarmowego. Równie łatwo przekracza barierę krew-mózg, " +
                        "przedostając się do ośrodkowego układu nerwowego, gdzie ulega przekształceniu w dopaminę. " +
                        "Podniesienie stężenia tego neuroprzekaźnika pozwala zwiększyć odczuwany poziom energii. " +
                        "Dzięki temu poprawia się motywacja do działania, a także zdolność do skupienia uwagi i " +
                        "pamięć robocza.");
        suplement3.setHowTo(
                "Standardowa dobowa dawka L-DOPA wynosi od 150 do 500 mg. Ilość tę można przyjąć jednorazowo lub " +
                        "rozbić na kilka porcji. Najkorzystniej jest stosować ją przed posiłkiem, zwłaszcza bogatym w" +
                        " węglowodany i ubogim w białka.");
        suplement3.setLinkUrl("http://www.muscle-zone.pl/lepsze-samopoczucie/l-dopa-90-kaps");

        suplements.add(suplement1);
        suplements.add(suplement2);
        suplements.add(suplement3);
    }

    private static void initSuplements2(List<Suplement> suplements) {
        Suplement suplement1 = new Suplement();
        suplement1.setName("5-HTP");
        suplement1.setSuplementDescription(
                "5-HTP to pochodna tryptofanu, czyli aminokwasu występującego w wysokobiałkowych produktach " +
                        "spożywczych, do których zalicza się mięso wołowe i drobiowe, ryby oraz nabiał.Ogromne " +
                        "zainteresowanie preparatem wywołał fakt, że korzystnie wpływa on na wiele czynności mózgu – " +
                        "poprawia nastrój, łagodzi migreny, zwalcza bezsenność oraz dodatkowo pozwala utrzymać " +
                        "właściwą masę ciała. W przeciwieństwie do wielu innych substancji odżywczych oraz leków, " +
                        "które składają się z substancji o dużych cząsteczkach, aby przeniknąć do mózgu, 5-HTP nie ma" +
                        " z tym trudności. Po dotarciu do mózgu jest przekształcany w serotoninę – jeden z " +
                        "przekaźników nerwowych, niezwykle ważny dla prawidłowego funkcjonowania układu nerwowego. " +
                        "Serotonina wpływa na wiele naszych narządów, ale jej podstawowym miejscem działania jest " +
                        "właśnie mózg.");
        suplement1.setHowTo(
                "Dzienna dawka 5-HTP wynosi od 100 do 500 mg. Ilość tę można przyjąć jednorazowo, najlepiej przed " +
                        "snem, lub rozdzielić na kilka porcji. Zaleca się stopniowe podnoszenie dawki 5-HTP, " +
                        "rozpoczynając od 100 mg/dobę przez pierwsze 2 tygodnie suplementacji. ");
        suplement1.setLinkUrl("http://pl.swissherbal.eu/sklep/5-htp/");

        Suplement suplement2 = new Suplement();
        suplement2.setName("GABA");
        suplement2.setSuplementDescription(
                "GABA - ważny neurotransmiter o wydłużonym działaniu i aktywator przemiany materii. Działa " +
                        "relaksująco, wspomaga regenerację i tworzenie masy mięśniowej, przyspiesza powrót do zdrowia" +
                        ". Zwiększa wytrzymałość i poprawia wydolność poprzez nasilenie procesów spalania tłuszczów w" +
                        " mitochondriach i uzyskiwania z nich energii. Stabilizuje ciśnienie krwi, zapobiega bólom i " +
                        "zmniejsza ryzyko wystąpienia skurczów mięśniowych podczas wysiłku fizycznego. - ważny " +
                        "neurotransmiter o wydłużonym działaniu i aktywator przemiany materii. Działa relaksująco, " +
                        "wspomaga regenerację i tworzenie masy mięśniowej, przyspiesza powrót do zdrowia. Zwiększa " +
                        "wytrzymałość i poprawia wydolność poprzez nasilenie procesów spalania tłuszczów w " +
                        "mitochondriach i uzyskiwania z nich energii. Stabilizuje ciśnienie krwi, zapobiega bólom i " +
                        "zmniejsza ryzyko wystąpienia skurczów mięśniowych podczas wysiłku fizycznego.");
        suplement2.setHowTo(
                "Na początku okresu suplementacji najlepiej zażywać GABA w ilości 1-2 g dziennie (kobiety i osoby o " +
                        "niskiej wadze ciała 1 g, pozostali 2 g). Jeśli po 5 minutach nie zauważymy działania " +
                        "substancji (lekkie rozluźnienie, wyciszenie, szybkie zaśnięcie), następnym razem można " +
                        "zwiększyć dawkę o 50% i obserwować reakcję organizmu. Nie należy przyjmować więcej niż 5 g " +
                        "GABA dziennie z uwagi na ryzyko pojawienia się działań niepożądanych.");
        suplement2.setLinkUrl("http://www.muscle-zone.pl/lepszy-sen/gaba-750mg-100-kaps");

        Suplement suplement3 = new Suplement();
        suplement3.setName("L-Tryptofan");
        suplement3.setSuplementDescription(
                "L-Tryptofan – należy do grupy aminokwasów egzogennych, niezbędny w organizmie człowieka, realizujący" +
                        " różnorodne funkcje. Bardzo ważną rolę odgrywa w regulacji układu nerwowego, poprzez " +
                        "produkcję serotoniny, która istotnie poprawia nastrój, natomiast jej niski poziom może " +
                        "wpływać na rozdrażnienie, obniżenie nastroju oraz bezsenność, co w konsekwencji może " +
                        "prowadzić do stanów depresyjnych. Dodatkowo pierwiastek ten bierze udział w wytwarzaniu " +
                        "melatoniny, która odpowiedzialna jest za jakość snu, co pozytywnie oddziaływuję na " +
                        "regenerację organizmu.");
        suplement3.setHowTo(
                "Dawkowanie tryptofanu to od 500 do 2000 miligramów dziennie przed snem lub od 500 do 1000 miligramów" +
                        " przed posiłkami.");
        suplement3.setLinkUrl("http://www.muscle-zone.pl/lepszy-sen/l-tryptophan-120-kaps");

        suplements.add(suplement1);
        suplements.add(suplement2);
        suplements.add(suplement3);
    }

    private static void initSuplements3(List<Suplement> suplements) {
        Suplement suplement1 = new Suplement();
        suplement1.setName("Hupercyna A");
        suplement1.setSuplementDescription(
                "Hupercyna A (huperzine A) - alkaloid pochodzenia roślinnego posiadający zdolność przenikania bariery" +
                        " krew-mózg , będący katalizatorem ujemnym rozkładu acetylocholiny, usprawniającym " +
                        "przewodnictwo nerwowe i mającym znaczący wpływ na koncentrację, kojarzenie i zapamiętywanie." +
                        " Pomaga łagodzić skutki stresu tlenowego, zapobiega depresjom oraz wykazuje właściwości " +
                        "neuroprotekcyjne poprawiające samopoczucie. W suplementacji sportowej zalecana w okresie " +
                        "przedtreningowym, przedwysiłkowym oraz w trakcie trwania wysiłku, w celu poprawy " +
                        "koncentracji jako składnik zaawansowanych stacków kreatynowych, no-boosterów oraz w postaci " +
                        "preparatów ziołowych poprawiających nastrój.");
        suplement1.setHowTo(
                "Dzienna zalecana dawka hupercyny to 100-200 mikrogramów. Należy ją zażywać  „na dzień” i tylko w " +
                        "dni, w które potrzebujesz większej wydolności intelektualnej (czyli nie w weekendy czy " +
                        "podczas urlopu).Testowana dzienna dawka wynosi 200 µg. Jest ona mała, dlatego hupercyna " +
                        "sprzedawana jest w malutkich tabletkach. Początkującym użytkownikom zalecam rozpoczęcie od " +
                        "100 µg na dzień.");
        suplement1.setLinkUrl("http://www.muscle-zone.pl/metabolizm-i-krazenie-mozgowe/huperzine-a-120-kaps");

        Suplement suplement2 = new Suplement();
        suplement2.setName("Alpha-GPC");
        suplement2.setSuplementDescription(
                "Alpha-GPC jest to syntetyczna cholina przechodząca bezpośrednio przez barierę krew-mózg. Cholina " +
                        "natomiast jest substancją naturalnie występującą w mózgu człowieka, wykazującą właściwości " +
                        "nootropowe oraz psychostymulujące.Suplement Alpha-GPC jest polecany dla osób, które mają " +
                        "problemy z pamięcią, koncentracją oraz tym, które chcą poprawić swoją sprawność umysłową. " +
                        "Ponadto znajdzie swoje zastosowanie w przypadku zmęczenia psychicznego czy braku skupienia. " +
                        "Pomoże również zwalczyć problemy z przyswajaniem większej ilości informacji. Jest również " +
                        "doskonałym rozwiązaniem w sytuacji, gdy inne suplementy nie działają wystarczająco silnie " +
                        "(zawierające np. związki z grupy racetamów, jak np. noopept, pramiracetam, itp.). Działanie " +
                        "Alpha-GPC jest odczuwalne od razu, nie trzeba czekać długo na efekty.");
        suplement2.setHowTo(
                "Zaleca się stosowanie Alpha-GPC od 300 mg do 600 mg dziennie bądź zgodnie z zaleceniami specjalisty." +
                        " Należy pamiętać, że suplement nie może być traktowany jako substytut prawidłowej diety. " +
                        "Poleca się również, aby kobiety w ciąży i karmiące piersią przez zastosowaniem Alpha-GPC " +
                        "skonsultowały się ze specjalistą.");
        suplement2.setLinkUrl("http://www.muscle-zone.pl/regeneracja-ukladu-nerwowego/hadess-alpha-gpc-60-kaps");

        Suplement suplement3 = new Suplement();
        suplement3.setName("CDP-Cholina");
        suplement3.setSuplementDescription(
                "CDP-Cholina – naturalnie występujący, endogenny prekursor fosfatydylocholiny – podstawowego budulca " +
                        "fosfolipidów błon komórkowych. Po dostarczeniu do organizmu ulega hydrolizie do cytydyny i " +
                        "choliny, które w dość łatwy sposób przenikają przez barierę krew-mózg, po czym odgrywają " +
                        "doniosłą rolę w syntezie i regeneracji błon komórek nerwowych, kwasów nukleinowych i wielu " +
                        "ważnych białek. Cytykolina jest również wydajnym substratem do syntezy acetylocholiny, przez" +
                        " co wpływa korzystnie na funkcje poznawcze i pamięć roboczą.");
        suplement3.setHowTo(
                "Najczęściej zalecana dzienna dawka CDP-choliny to od 250 do 500 mg na dobę, przyjmowane bez posiłku." +
                        " Ilość tę można stosować jednorazowo lub rozłożyć na dwie porcje.");
        suplement3.setLinkUrl("http://www.muscle-zone.pl/cholina/citicoline-cdp-choline-250mg-120-kaps");

        suplements.add(suplement1);
        suplements.add(suplement2);
        suplements.add(suplement3);
    }

    private static void initSuplements4(List<Suplement> suplements) {

        Suplement suplement1 = new Suplement();
        suplement1.setName("Ashwagandha");
        suplement1.setSuplementDescription(
                "Ashwagandha (Withania somnifera) to zioło, które swoją popularność zyskało już kilka tysięcy lat " +
                        "temu, stanowiąc podstawowy surowiec roślinny stosowany w indyjskim systemie medycyny " +
                        "naturalnej (Ajurwedze). Ashwagandha nazywana jest również „indyjskim żeń-szeniem”.Withania " +
                        "somnifera posiada wielokierunkowe działanie – wspomaga utrzymanie homeostazy, wspiera układ " +
                        "immunologiczny oraz zwiększa zdolność adaptacyjną organizmu do warunków stresowych. " +
                        "Adaptogeny to grupa substancji pochodzenia roślinnego, które wywierają korzystny wpływ na " +
                        "układ nerwowy – łagodzą i przeciwdziałają szkodliwym skutkom ekspozycji na stresogeny " +
                        "poprzez zwiększenie zdolności adaptacyjnych organizmu.");
        suplement1.setHowTo(
                "Skuteczne dawki suchych ekstraktów (1,5% witanolidów) wynoszą ok 500 mg na dzień. Przyjmuje się, że " +
                        "sproszkowany korzeń należy zażywać w ilości ok. 6 do 7 g dzienne, natomiast w przypadku " +
                        "nalewki/ekstraktu płynnego w stosunku 1:2 – 12 ml dziennie.");
        suplement1.setLinkUrl("http://www.muscle-zone.pl/adaptogeny/apollos-ashwagandha-60-kaps");

        Suplement suplement2 = new Suplement();
        suplement2.setName("Gotu Kola");
        suplement2.setSuplementDescription(
                "Gotu Kola (Wąkrota azjatycka, Centella asiatica L.) należy do roślin leczniczych. Jest ona " +
                        "wykorzystywana od tysięcy lat w Ajurwedzie – indyjskiej medycynie naturalnej. Roślina ta ma " +
                        "wielokierunkowe działanie, spowalnia procesy starzenia, wspomaga leczenie zmian skórnych, " +
                        "usprawnia pracę układu sercowo-naczyniowego oraz poprawia czynność mózgu.Ekstrakt z Centella" +
                        " asiatica tonizuje ośrodkowy układ nerwowy, działa uspokajająco, przeciwlękowo, redukuje " +
                        "objawy depresji oraz posiada właściwości przeciwbólowe. Za właściwości sedatywne są " +
                        "odpowiedzialne głównie glikozydy, które wykazują działanie podobne do łagodnego środka " +
                        "uspokajającego.");
        suplement2.setHowTo(
                "Standardowa dawka w przypadku 20% ekstraktu z wąkroty azjatyckiej mieści się w granicach 75-300 mg " +
                        "dziennie. Ilość tę najlepiej jest rozłożyć na dwie porcje przyjmowane z posiłkiem");
        suplement2.setLinkUrl("http://www.muscle-zone.pl/adaptogeny/gotu-kola-double-extract-100-kaps");

        Suplement suplement3 = new Suplement();
        suplement3.setName("Bacopa Monnieri");
        suplement3.setSuplementDescription(
                "Bacopa monnieri (inaczej Brahmi) to jedno z najbardziej oryginalnych ziół indyjskich. Mówi się, że " +
                        "jego nazwa pochodzi od słowa Brahman, oznaczającego „uniwersalną świadomość”, co idealnie " +
                        "odzwierciedla główne działanie tej rośliny.Bacopa monnieri stanowi ogromne wsparcie dla " +
                        "układu nerwowego - stymuluje zwłaszcza część odpowiedzialną za procesy pamięciowe.Oprócz " +
                        "udowodnionych właściwości nootropowych i neuroprotekcyjnych, Bacopa wykazuje również silne " +
                        "działanie przeciwlękowe. Wspomaga leczenie nerwicy, jest z powodzeniem wykorzystywana w " +
                        "terapii nadpobudliwości i ADHD, a w przypadku depresji wykazuje skuteczność porównywalną do " +
                        "TLPD (trójpierścieniowe leki przeciwdepresyjne).");
        suplement3.setHowTo(
                "Standardowa, skuteczna dawka Brahmi wynosi 200 – 300 mg na dobę i dotyczy ekstraktu standaryzowanego" +
                        " na 50% bakozydów. Najlepiej jest rozbić tę ilość na kilka mniejszych porcji.");
        suplement3.setLinkUrl("http://www.muscle-zone.pl/adaptogeny/bacopa-monnieri-100-kaps");

        suplements.add(suplement1);
        suplements.add(suplement2);
        suplements.add(suplement3);
    }

    private static void initHealthProblems(List<HealthProblem> healthProblems) {
        HealthProblem healthProblem1 = new HealthProblem();
        healthProblem1.setName("Chroniczne zmęczenie");
        healthProblem1.setCause(
                "Naukowcy podejrzewają, że przyczynami choroby mogą być czynniki immunologiczne, czyli związane z " +
                        "układem odpornościowym człowieka, np. alergie i zakażenia infekcyjne (niektóre osoby " +
                        "bezpośrednio przed wystąpieniem CFS przechodzą infekcje grypopodobne). Zespół przewlekłego " +
                        "zmęczenia może być wywołany ciężkim przebiegiem mononukleozy lub też wirusem EBV, który " +
                        "uaktywnia się po jej bezobjawowym przebiegu. Niektórzy badacze zwracają uwagę także na " +
                        "zaburzenia metabolizmu kwasu mlekowego w mięśniach i obecność RNA enterowirusa w mięśniach, " +
                        "jak również na niedobór składników odżywczych. Według innej teorii przyczyną CFS są " +
                        "zaburzenia w wydzielaniu jednego z hormonów produkowanych przez nadnercza.");
        healthProblem1.setDescription(
                "Zespół chronicznego zmęczenia (chronic fatique syndrome - CFS) to niewytłumaczalne zmęczenie, które " +
                        "nie ustępuje po odpoczynku i trwa ponad 6 miesięcy. Zespół przewlekłego zmęczenia jest " +
                        "uważany za kolejną chorobę cywilizacyjną, jednak oficjalnie nie można powiedzieć, że to " +
                        "choroba, ponieważ CFS  nie ma w międzynarodowym spisie chorób, jakie psychiatrzy mogą " +
                        "rozpoznawać.");
        List<Suplement> recommendedSuplements = new ArrayList<>();
        initSuplements(recommendedSuplements);
        healthProblem1.setSuplements(recommendedSuplements);

        HealthProblem healthProblem2 = new HealthProblem();
        healthProblem2.setName("Zaburzenia snu");
        healthProblem2.setCause(
                "Przyczyn braku snu może być bardzo wiele. Wśród nich, w większości wymienia się czynniki, na które " +
                        "mamy bezpośrednio wpływ i samodzielnie możemy je modyfikować.Często zdarza się, że przyczyną" +
                        " bezsenności u dorosłych, jak również u dzieci, jest niewłaściwa higiena snu. Ten rodzaj " +
                        "zaburzeń snu wiąże się przede wszystkim ze złymi przyzwyczajeniami, niekiedy może być " +
                        "spowodowany także pracą zmianową. Zbyt późne kładzenie się spać, niewłaściwe warunki " +
                        "panujące w sypialni, a także spożywanie przed snem obfitych posiłków i substancji " +
                        "powodujących może powodować regularne problemy ze spaniem.");
        healthProblem2.setDescription(
                "Zaburzenia snu mogą dotyczyć nieprawidłowego czasu trwania snu lub niepożądanych zachowań " +
                        "występujących w jego trakcie. Jest to bardzo poważny problem kliniczny, który odbija się na " +
                        "codziennym funkcjonowaniu chorego, niekiedy uniemożliwiając mu prowadzenie normalnej " +
                        "aktywności życiowej.Zaburzenia snu dotyczą coraz większego odsetka populacji – szacuje się, " +
                        "że około 30% ludzi cierpi na różnego rodzaju problemy ze snem. Najczęściej występującym " +
                        "schorzeniem tego typu jest bezsenność – jej objawy mogą dotyczyć nawet połowy dorosłych " +
                        "osób, a u ok. 10% diagnozuje się jej postać przewlekłą (chroniczną).");
        List<Suplement> recommendedSuplements2 = new ArrayList<>();
        initSuplements2(recommendedSuplements2);
        healthProblem2.setSuplements(recommendedSuplements2);

        HealthProblem healthProblem3 = new HealthProblem();
        healthProblem3.setName("Zaburzenia koncentracji i uwagi");
        healthProblem3.setCause(
                "Jednoznaczna przyczyna występowania ADD u dzieci i dorosłych do dziś nie została poznana. Uważa się," +
                        " że w patogenezie zaburzenia rolę odgrywać mogą odziedziczone geny – zauważalne jest bowiem " +
                        "to, że zaburzenia koncentracji uwagi częściej występują u tych osób, w których rodzinach " +
                        "ktoś już wcześniej doświadczał podobnych problemów.");
        healthProblem3.setDescription(
                "ADD (skrót od angielskiego Attention Deficit Disorder) to zaburzenia koncentracji uwagi. Problem ten" +
                        " traktowany jest jako odmiana ADHD, od jednostki tej odróżnia go brak nadpobudliwości " +
                        "ruchowej lub pojawianie się jej jedynie w nieznacznym natężeniu.Zaburzenia koncentracji " +
                        "uwagi typowo zaliczane są do problemów dotyczących dzieci. W rzeczywistości ADD występuje " +
                        "zarówno u dzieci, jak i u dorosłych.");
        List<Suplement> recommendedSuplements3 = new ArrayList<>();
        initSuplements3(recommendedSuplements3);
        healthProblem3.setSuplements(recommendedSuplements3);

        HealthProblem healthProblem4 = new HealthProblem();
        healthProblem4.setName("Przewlekły stres");
        healthProblem4.setCause(
                "Stres może być wywołany wieloma czynnikami. Często są to powody bardzo poważne, a czasem wręcz " +
                        "banalnie błahe. Wszystko zależy od sposobu postrzegania przez daną osobę sytuacji, z jaką  " +
                        "przyszło jej się zmierzyć. Dla jednych powód do radości, dla innych przyczyna silnego " +
                        "napięcia nerwowego – każdy człowiek jest inny i inaczej może reagować na to, co go otacza.");
        healthProblem4.setDescription(
                "Silne napięcie nerwowe jest naszą naturalną reakcją na trudne sytuacje i zwykle mobilizuje do " +
                        "działania. Niestety, gdy stres się przedłuża, wyniszcza organizm - może przyczyniać się do " +
                        "kłopotów ze snem, lęków, nerwicy, a nawet depresji.Skutki przewlekłego stresu to osłabienie " +
                        "układu odpornościowego, zaostrzanie objawów wielu chorób z autoagresji, np. Hashimoto, " +
                        "Gravesa-Basedowa, reumatoidalnego zapalenia stawów, cukrzycy, wrzodziejącego zapalenia " +
                        "jelita grubego. Współcześnie jesteśmy nieustannie narażeni na stres. Czasem bywa to stres " +
                        "mobilizujący, ale częściej - zwłaszcza gdy stan napięcia utrzymuje się długo, działa on " +
                        "niekorzystnie na nasze zdrowie. Zobacz, jakie jeszcze skutki może spowodować przewlekłe " +
                        "napięcie nerwowe.");
        List<Suplement> recommendedSuplements4 = new ArrayList<>();
        initSuplements4(recommendedSuplements4);
        healthProblem4.setSuplements(recommendedSuplements4);

        healthProblems.add(healthProblem1);
        healthProblems.add(healthProblem2);
        healthProblems.add(healthProblem3);
        healthProblems.add(healthProblem4);
    }
}
