package pl.kalandyk.suplement.selector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kalandyk.suplement.selector.domain.Suplement;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@TestPropertySource("classpath:application-test.properties") //wczytanie testowych zmiennych srodowiskowych
public class ApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setUp() {
        //usuniecie pliku testowego z baza
        File dbFile = new File("test-suplementSelector.db");
        if (dbFile.exists()) {
            dbFile.delete();
        }
    }

    @Test
    public void shouldAddSupplement() {
        //given
        Suplement suplement = new Suplement();
        suplement.setHowTo("testhowTo");
        suplement.setName("testName");
        suplement.setSuplementDescription("testDescription");
        suplement.setLinkUrl("testUrl");

        ResponseEntity<Suplement> suplementResponseEntity = restTemplate.postForEntity("/suplements", suplement, Suplement.class);
        //when
        Suplement[] response = restTemplate.getForEntity("/suplements", Suplement[].class).getBody();
        //then
        assertThat(response).hasSize(1);
        assertThat(response[0].getHowTo()).isEqualTo("testhowTo");
        assertThat(response[0].getName()).isEqualTo("testName");
        assertThat(response[0].getSuplementDescription()).isEqualTo("testDescription");
        assertThat(response[0].getLinkUrl()).isEqualTo("testUrl");
    }
}
