

function makeArmy() {

    var shooters = [];

    for (var i = 0; i < 10; i++) {
        var shooter = function() {

            var num = i;// функция-стрелок
            alert(num); // выводит свой номер
        };
        shooters.push(shooter);
    }

    return shooters;
}


 var s = makeArmy();


  alert(s[0]());
  alert(s[4]());
