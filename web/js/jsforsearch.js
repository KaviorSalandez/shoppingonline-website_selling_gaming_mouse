/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function setCheck(obj) {
    var fries = document.getElementsByName('cidd');
    if ((obj.id == 'c0') && (fries[0].checked == true))
    {
        //bo tich cac gia tri ben duoi
        for (var i = 1; i < fries.length; i++)
            fries[i].checked = false;
    } else {
        // cac gia tri duoc tich bang true 
         // va all = false
        for (var i = 1; i < fries.length; i++) {
            if (fries[i].checked == true) {
                fries[0].checked = false;
                break;
            }
        }
    }
    document.getElementById('f1').submit();
}
function setCheck1(obj) {
    var fries = document.getElementsByName('price');
    if ((obj.id == 'g0') && (fries[0].checked == true))
    {
        for (var i = 1; i < fries.length; i++)
            fries[i].checked = false;
    } else {
        for (var i = 1; i < fries.length; i++) {
            if (fries[i].checked == true) {
                fries[0].checked = false;
                break;
            }
        }
    }
    document.getElementById('f2').submit();
}

