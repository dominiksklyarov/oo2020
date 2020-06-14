class Main {
  public static void main(String[] args) throws Exception  {
  
    // pendlivonge iga 6 sekundi tagant
    Pendulum pendulum = new Pendulum(8.9426);
    // hammasrattal on 10 hammast
    Cog cog = new Cog(10);
    pendulum.addCog(cog);
    // lisame teise hammasratta kus on 600 hammast
    Cog cog2 = new Cog(10*60);
    pendulum.addCog(cog2);
    pendulum.print();
    //System.out.println(2 * Math.PI * Math.sqrt(10 / 9.8));
  }
}

/** Koosta klass pendli jaoks. Võnkeperiood = 2 x Pi * sqrt(pikkus/9.8). Määra peaprogrammist pendli pikkus ning pane tiksumise taktis välja trükkima.

* Koosta klass hammasratta jaoks. Ette antakse hammaste arv. Pendlil on viide hammasrattale, millega ta seotud. Anna peaprogrammis andmed pendli ja hammasratta kohta, pane süsteem tööle, kus on näha/lugeda pendli tiksumine ning ratta tehtud ringid.

* Hammasrattal on kõrvuti kaks erisuguse hammaste arvuga ringi. Hammasrattaid saab omavahel kokku ühendada ning hammaste arvu erinevust ülekandena kasutada. Ehita nende abil kokku kellamehhanism, kus tiksuks pendel, liiguks tunni- ja minutiosuti. Logimisel kuvatakse andmed detailide seisu kohta. Arvesta hammasrataste loomisel mõõtmetega, et igas ringis oleks vähemasti 10 hammast, hamba suurus poleks alla millimeetri ning kogu kellamehhanism mahuks 10x10x10 cm suurusesse karpi (+ pendel eraldi)
*/
