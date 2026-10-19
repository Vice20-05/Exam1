Exam Zokni type B
Made it till 4 excersise  added comments .
Exercise 5 missing but main idea of it is written 

Java OOP - B valtozat

UMFST - Informatika II. év | Java OOP gyakorlati felméré | 90 perc | 20 pont

Beadas: GitHub/GitLab repository URL az oktaté &ltal megadott fellileten, a 90 perc lejarta el6tt. A
repository tartalmazza a futtathaté Java-forrasokat és a README. md f&jlt. Papiralapu beadas nincs.

Al hasznélata tilos. Az internetes példakédok masoldsa sem helyettesiti az 6nallé6 munkat. A programot az
oktaté forditja/futtatja, és széban rakérdezhet barmely részletére.

Kotelezé Git-folyamat: legaldbb 5 értelmes commit, amelyek egyértelm(en az 1-5. feladathoz tartoznak.
Példaul: Task 1 fix constructor ... Task 5 implement logic. Ot res vagy kizarélag README-t
moédosité commit nem felel meg.

Névmeg6rzés: a megadott osztaly-, mezé-, paraméter- és metédusneveket, valamint az elgirt
metédusszignatdrakat pontosan meg kell tartani. Uj segédmetédusok készithet6k; a meglévé nevek atirdsa
nem elfogadhaté.

Kédmindség: Java naming convention (osztélyok PascalCase, metddusok és véltozék camelCase), 4
sz6koz0s kovetkezetes behizas, jél elkildnitett feleldsségek, értelmes angol nyelvii kommentek a nem
trivialis logikahoz. Nem sziikséges minden sorhoz komment.

Levondsok a 20 pontbdl: hidnyzé vagy értelmetlen commit: -0,5 pont/db (legfeljebb -2,5); kotelezé
nevek/szignatiréak indokolatlan médositésa: -1 pont; rendezetlen kéd/konvenciok megsértése: -1 pont;
hianyzd, vagy félrevezeté érdemi kommentek: -1 pont; hidnyzé README vagy nem hasznalhaté repository
link: -1 pont. Az 6sszes levonas legfeljebb 5 pont; negativ végsé pontszam nincs.

README. md: a futtatas lépései, az elvart kimenet, valamint 3-5 mondat arrél, hol valésul meg 6roklés és
polimorfizmus. Minden feladat megoldésat Java-ban készitsd el; Java 8+ nyelvi Gjdonsag nem sziikséges.
B valtozat - Urzokni-teleportaciés hivatal

Kiindul6 kéd: masold a kdvetkezd osztalyokat a projektbe, majd javitsd/kiegészitsd a kdvetelményeknek
megfeleléen. A hibak szandékosak. A feladat nem igényel adatbazist, halézatot vagy GUI-t.
class UrZokni {
public String azonosito;
private int tisztasagPont;
public UrZokni(String azonosito, int tisztasagPont) {
azonosito = azonosito;
this.tisztasagPont = tisztasagPont;
}
public void mosas(int pluszPont) {
tisztasagPont += pluszPont;
}
public int getTisztasagPont() {
return tisztasagPont;
}
public String cimke() {
return azonosito + ": “ + tisztasagPont;
}
}
class TeleportalosUrZokni extends UrZokni {
private String galaxis;
public TeleportalosUrZokni(String azonosito,
int tisztasagPont,
String galaxis) {
super (azonosito, tisztasagPont);
this.galaxis = galaxis;
}
@override
public String cimke() {
return "Teleport zokni: * + azonosito;
}
}
public class Main {
public static void main(String[] args) {
UrZokni z = new TeleportalosUrZokni (
"ZOKNI-42", 4, "Andromeda");
2z.mosas (6) ;
System.out.println(z.cimke());
}
}
1. Konstruktor és objektumallapot - 3 pont
Javitsd a UrZokni konstruktorat (gy, hogy a azonosito ténylegesen az atadott értéket térolja. Az eredeti
konstruktor-paraméterek és nevek maradjanak meg. irj révid angol kommentet a javitott sorhoz, amely
megmagyarazza a problémat.
2. Adatrejtés és ellenérzott elérés - 3 pont
A azonosito mez legyen private. Hozz létre egy public String getAzonosito() metédust. A
leszarmazott osztély ne érje el kdzvetlenil a sziil§ privat mez6jét; a gettert hasznélja. Ne nevezz at
semmilyen meglévé metédust.
3. Validacié és szabalyos allapot - 4 pont
A konstruktor ne engedjen negativ tisztasagPont értéket. A mosas(int pluszPont) metédus ne fogadjon
negativ paramétert. Mindkét hibas bemenetnél dobj I1legalArgumentException-t. Null vagy res
azonosito se legyen elfogadhaté. A 0 érvényes.
4. Oroklés, feliiliras, polimorfizmus - 6 pont
Javitsd a TeleportalosUrZokni cimke() metédusat Ggy, hogy a sajat specialis mezdjét is megjelenitse. Az
alapvaltozat adja vissza az azonosit6t és a pontszamot; a leszarmazott véltozat azonositét, pontszamot és
a specialis mez6t. A main-ben készits egy alap- és egy leszarmazott objektumot, térold éket UrZokni tipusi
referencidkban és hivd meg mindkett6n a cimke () metédust. A hivasnak a valédi objektumtipusnak
megfelelé metédust kell futtatnia.
5. Onallé algoritmikus feladat - 4 pont
Az (rzoknik 1-t6l kezd6déen kapnak sorszamot, de néhény eltdnt a teleportban. Implementéld pontosan
ezt a statikus metédust: public static int elsoHianyzoZokni(int[] sorszamok). A legkisebb, pozitiv
hidnyz6 egész szamot adja vissza. A bemenetben duplikdtum, 0 és negativ szam is lehet; az eredeti témbot
ne médositsd. Ures témbre 1 az eredmény. Nem kell rendezést vagy haladé kollekciékat hasznalnod.

// Expected: 3

int[] sorszamok = {4, 1, 2, 2, 8, -5};

System.out.println(elsoHianyzoZokni (sorszamok));

// Expected: 4

System.out.println(elsoHianyzoZokni (

new int[] {1, 2, 3}));

A logikai feladat 6nall6: 4/20 pontot ér. A miikddé megoldas tobbet ér, mint egy j6l hangzé magyarazat.
Készits hozza legalébb két tovabbi tesztesetet; a nem trividlis cikluslogikat angol kommenttel magyarézd.