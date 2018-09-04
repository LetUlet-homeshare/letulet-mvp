var active_li;


function setNavbarActive(file) {
    switch (file) {
        case "proposals.jsp":
            $('a#proposals').parent().addClass('active');
            active_li = $('a#proposals').parent();
            break;
        case "dashboard.jsp":
            $('a#dashboard').parent().addClass('active');
            active_li = $('a#dashboard').parent();
            break;
        case "settings.jsp":
            $('a#settings').parent().addClass('active');
            active_li = $('a#settings').parent();
            break;
        case "banks.jsp":
            $('a#banks').parent().addClass('active');
            active_li = $('a#banks').parent();
            break;
        default:
            break;
    }
}

/* When the user clicks on the button,
 toggle between hiding and showing the dropdown content */
function toggleDropdown() {
    document.getElementById("myDropdown").classList.toggle("active");
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
    if (!event.target.matches('.dropbtn')) {

        var dropdowns = document.getElementsByClassName("dropdown-content");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('active')) {
                openDropdown.classList.remove('active');
            }
        }
    }
}