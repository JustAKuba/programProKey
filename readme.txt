Udělej abstraktní třídu Vehicle a k ní child třídy Car a Truck

Každé vozidlo by mělo mít parametr jméno, motor, kolik cylindrů má motor, kola a list rádií, které vozidlo má.
Vozidlo by mělo mít schopnost nastartovat, akcelerovat, brzdit (Jen si vracej stringy, jde o to aby to dávalo smysl :) )

Rádia se můžou produkovat různá, proto by měly být standardizované, viz. interface ICarRadio
K tomu vytvoř třídy CarRadio a TruckRadio, které implementují tenhle interface.
Radio by mělo mít schopnost se zapnout a vypnout, změnit stanici, změnit hlasitost.
Na stanice doporučím enum.

Výstup by měl být následující pro jedno vozidlo

Car -> startEngine()
Car -> accelerate()
Car -> brake()
EVROPA_2
10                    <= Tohle je volume
true                  <= Tohle je jestli je radio zapnute



