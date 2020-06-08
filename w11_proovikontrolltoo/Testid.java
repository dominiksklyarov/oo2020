import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
public class Testid
{
//pudel
  @Test
   public void leia_kogumass_test()
   {
      Jook jook = new Jook("Mahl", 1.25, 0.9);
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, jook);
      assertEquals(0.65, joogipudel.leiaKogumass(), 0.001);
   }

   @Test
   public void leia_kogumass_ilma_joogita_test()
   {
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, null);
      assertEquals(0.2, joogipudel.leiaKogumass(), 0.001);
   }

   @Test
   public void leia_omahind_test()
   {
      Jook jook = new Jook("Mahl", 1.25, 0.9);
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, jook);
      assertEquals(0.725, joogipudel.leiaOmahind(), 0.001);
   }
//vaat
   @Test
   public void t2idaPudel_test()
   {
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, null);
      Joogivaat joogivaat = new Joogivaat(60.0, 50.0);
      joogipudel = joogivaat.t2idaPudel(joogipudel);
      assertEquals("vaadijook", joogipudel.jook.joogiNimetus);
   }

   @Test
   public void villiPudelitesse_test()
   {
      Joogivaat joogivaat = new Joogivaat(1.0, 1.0);
      ArrayList<Joogipudel> joogipudelid = joogivaat.villiPudelitesse();
      assertEquals(2, joogipudelid.size());
   }

   //kast
   @Test
   public void leiaUhineMass_test()
   {
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, null);
      JoogipudeliKast joogipudeliKast = new JoogipudeliKast("testKast", 20.0, 15.0, 24);
      joogipudeliKast.lisaPudel(joogipudel);
      assertEquals(0.2, joogipudeliKast.leiaUhineMass(), 0.001);
   }

   @Test
   public void leiaUhineOmahind_test()
   {
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.2, 0.10, null);
      JoogipudeliKast joogipudeliKast = new JoogipudeliKast("testKast", 20.0, 15.0, 24);
      joogipudeliKast.lisaPudel(joogipudel);
      assertEquals(0.1, joogipudeliKast.leiaUhineOmahind(), 0.001);
   }

  @Test
   public void villiVaadistKasti_test()
   {
      JoogipudeliKast joogipudeliKast = new JoogipudeliKast("testKast", 20.0, 15.0, 24);
      Joogivaat joogivaat = new Joogivaat(60.0, 5.0);
      int jookeKastis = joogipudeliKast.villiVaadistKasti(joogivaat);
      assertEquals(10, jookeKastis);
   }
}