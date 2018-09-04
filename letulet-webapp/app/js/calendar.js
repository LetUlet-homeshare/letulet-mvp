Calendar.prototype.container = null;
Calendar.prototype.currentMonth = null;
Calendar.prototype.startOfCalendar = null;
Calendar.prototype.endOfCalendar = null;
Calendar.prototype.events = [];
Calendar.prototype.isFilled = null;
Calendar.prototype.onEventClick = null; //deprecated
Calendar.prototype.calendarPopoverEngine = new CalendarPopoverEngine();
Calendar.prototype.CONFIGURATIONS = {
    CONTAINER_CLASS: "calendar",
    HEADER_CLASS: "calendar-days",
    BODY_CLASS: "calendar-content",
    WEEK_CLASS: "calendar-row",
    MORNING_CLASS: "morning",
    AFTERNOON_CLASS: "afternoon",
    MONTH_PAST_CLASS: "past",
    EVENT_CLASS: "booked",
    CHECKIN_CLASS: "checkin",
    CHECKOUT_CLASS: "checkout",
    DAYS: ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"],
    NUMBER_OF_WEEKS: 6,
    DATAEVENTS: {
        NEXT_MONTH_EVENT: "data-calendar-next-month",
        PREVIOUS_MONTH_EVENT: "data-calendar-previous-month"
    },
    DATASTRING: {
        CURRENT_MONTH_STRING: "data-calendar-current-month"
    },
    POPOVER: true
};


function Calendar (containerID, options) {

    if (typeof containerID == "undefined") {
        throw new Error("Container ID undefined");
    }

    this.container = document.getElementById(containerID);
    this.container.innerHTML = "";

    this.container.classList.add(this.CONFIGURATIONS.CONTAINER_CLASS);

    if (typeof options.isFilled == "function") {
        
        this.isFilled = options.isFilled;
    }

    if (typeof options.onEventClick == "function") {

        this.onEventClick = options.onEventClick;
    }
    
    this._bootstrap();
}

Calendar.prototype._bootstrap = function () {

    var _this = this;

    this.drawHeader();
    this.drawBody();

    this.fill(null);

    //Events
    var nextMonthsEvents = document.querySelectorAll("[" + this.CONFIGURATIONS.DATAEVENTS.NEXT_MONTH_EVENT+ "]");

    for (var i = 0; i < nextMonthsEvents.length; i++) {

        nextMonthsEvents[i].addEventListener("click", function (e) {

            e.preventDefault();

            _this.nextMonth();

            return false;
        })
    }

    var previousMonthsEvents = document.querySelectorAll("[" + this.CONFIGURATIONS.DATAEVENTS.PREVIOUS_MONTH_EVENT+ "]");

    for (var i = 0; i < previousMonthsEvents.length; i++) {

        previousMonthsEvents[i].addEventListener("click", function (e) {

            e.preventDefault();

            _this.previousMonth();

            return false;
        })
    }

    this.container.addEventListener("click", function (e) {

        var target = e.target;

        if (target.dataset.day != "undefined") {

            if (typeof _this.onEventClick == "function") {

                var indexEvent = (target.dataset.event != "undefined") ? target.dataset.event : null;

                if (indexEvent != null) {

                    _this.onEventClick(target, _this.events[indexEvent]);
                }
            }
        }
    });
}

Calendar.prototype.drawHeader = function () {

    var div = document.createElement("div");
    div.classList.add(this.CONFIGURATIONS.HEADER_CLASS);

    var fragment = document.createDocumentFragment();

    for (var i =0; i < this.CONFIGURATIONS.DAYS.length; i++) {

        var _div = document.createElement("div");
        _div.innerHTML = this.CONFIGURATIONS.DAYS[i];
        fragment.appendChild(_div);
    }

    div.appendChild(fragment);

    this.container.appendChild(div);
}

Calendar.prototype.drawBody = function () {

    var div = document.createElement("div");
    div.classList.add(this.CONFIGURATIONS.BODY_CLASS);

    var weeksfragment = document.createDocumentFragment();

    for (var i =0; i < this.CONFIGURATIONS.NUMBER_OF_WEEKS; i++) {

        var week = document.createElement("div");
        week.classList.add(this.CONFIGURATIONS.WEEK_CLASS);

        for (var j =0; j < 7; j++) {

            var day = document.createElement("div");
            day.dataset.day = "-";
            delete day.dataset.event;

            var morning = document.createElement("div");
            morning.classList.add(this.CONFIGURATIONS.MORNING_CLASS);

            var afternoon = document.createElement("div");
            afternoon.classList.add(this.CONFIGURATIONS.AFTERNOON_CLASS);

            day.appendChild(morning);
            day.appendChild(afternoon);

            week.appendChild(day);
        }

        weeksfragment.appendChild(week);
    }

    div.appendChild(weeksfragment);

    this.container.appendChild(div);
}

//0 - 11
Calendar.prototype.fill = function (month) {
    
    //CHoose the current month
    if (typeof month == "undefined" || month == null) {

        month = moment().month();
    }

    var now = moment();
    var startOfMonth = now.month(month).startOf('month');

    var startOfCalendar = moment(startOfMonth);
    startOfCalendar.subtract(startOfMonth.day(), 'days');

    var pointer = moment(startOfCalendar);

    //Go through each days
    for (var i = 0; i < this.CONFIGURATIONS.NUMBER_OF_WEEKS; i++) {

        var divweeks = this.container.getElementsByClassName(this.CONFIGURATIONS.BODY_CLASS)[0];
        var divweek = divweeks.childNodes[i];

        for (var j = 0; j < this.CONFIGURATIONS.DAYS.length; j++) {

            var divday = divweek.childNodes[j];

            //Add days
            divday.dataset.day = pointer.date();

            //Add past
            if (pointer.month() != month) {

                divday.classList.add(this.CONFIGURATIONS.MONTH_PAST_CLASS);
            }

            pointer = pointer.add(1, 'days');
        }
    }

    this.currentMonth = month;
    this.startOfCalendar = startOfCalendar;
    this.endOfCalendar = moment(pointer).subtract(1, "days");

    //Display current month
    var currentMonths = document.querySelectorAll("[" + this.CONFIGURATIONS.DATASTRING.CURRENT_MONTH_STRING+ "]");

    for (var i = 0; i < currentMonths.length; i++) {

        currentMonths[i].innerHTML = startOfMonth.format("MMMM");
    }

    if (typeof this.isFilled == "function") {
        this.isFilled();
    }
}

Calendar.prototype.unfill = function (unfillEvent, unfillDate) {

    unfillEvent = (typeof unfillEvent == "undefined") ? true : unfillEvent;
    unfillDate = (typeof unfillDate == "undefined") ? true : unfillDate;

    //Go through each days
    for (var i = 0; i < this.CONFIGURATIONS.NUMBER_OF_WEEKS; i++) {

        var divweeks = this.container.getElementsByClassName(this.CONFIGURATIONS.BODY_CLASS)[0];
        var divweek = divweeks.childNodes[i];

        for (var j = 0; j < this.CONFIGURATIONS.DAYS.length; j++) {

            var divday = divweek.childNodes[j];

            //Add days
            if (unfillDate) {

                divday.dataset.day = "-";
            }

            if (unfillEvent) {

                divday.className = "";
                delete divday.dataset.event;
                delete divday.dataset.id;
                delete divday.dataset.toggle;
                delete divday.dataset.title;
            } else {

                divday.classList.remove(this.CONFIGURATIONS.EVENT_CLASS);
                divday.classList.remove(this.CONFIGURATIONS.CHECKIN_CLASS);
                divday.classList.remove(this.CONFIGURATIONS.CHECKOUT_CLASS);
            }
        }
    }
}

Calendar.prototype.removeAllEvents = function () {

    this.events = [];
    this.unfill(true, false);
}

Calendar.prototype.nextMonth = function () {

    if (this.CONFIGURATIONS.POPOVER) {

        this.calendarPopoverEngine.closeAll();
    }

    var month = this.currentMonth + 1;
    this.unfill();
    this.fill(month);
}

Calendar.prototype.previousMonth = function () {

    if (this.CONFIGURATIONS.POPOVER) {

        this.calendarPopoverEngine.closeAll();
    }

    var month = this.currentMonth - 1;
    this.unfill();
    this.fill(month);
}

Calendar.prototype.addEvent = function (event) {


    if (event instanceof CalendarEvent == false) {

        console.log("info", "Invalid Event");
        return null;
    }

    if (event.end.isBefore(this.startOfCalendar)) {

        return null;
    }


    if (event.start.isAfter(this.endOfCalendar)) {

        return null;
    }


    var divweeks = this.container.getElementsByClassName(this.CONFIGURATIONS.BODY_CLASS)[0];
    var pointer = moment(this.startOfCalendar);

    //GO through all week and find the day
    for (var i = 0; i < this.CONFIGURATIONS.NUMBER_OF_WEEKS; i++) {

        var divweek = divweeks.childNodes[i];

        for (var j = 0; j < this.CONFIGURATIONS.DAYS.length; j++) {

            var divday = divweek.childNodes[j];

            if (pointer.format("YYYY-MM-DD") == event.end.format("YYYY-MM-DD")) {

                divday.classList.add(this.CONFIGURATIONS.CHECKOUT_CLASS);
                divday.dataset.event = this.events.length;

                if (this.CONFIGURATIONS.POPOVER) {

                    divday.id = "popover" + event.id;
                    divday.dataset.toggle = "popover";
                    divday.dataset.content = "<div class='text-right'><div class='bagde'>Checked In</div></div>" +
                        "<h1>Jane Fonda</h1>" +
                        "<p class='nomargin'>Dec 1-4, 2 Guests<br/>$118 Expected Earning</p>";
                }
            }

            if (pointer.format("YYYY-MM-DD") == event.start.format("YYYY-MM-DD")) {

                divday.classList.add(this.CONFIGURATIONS.CHECKIN_CLASS);
                divday.dataset.event = this.events.length;

                if (this.CONFIGURATIONS.POPOVER) {

                    divday.id = "popover" + event.id;
                    divday.dataset.toggle = "popover";
                    divday.dataset.content = "<div class='text-right'><div class='bagde'>Checked In</div></div>" +
                        "<h1>Jane Fonda</h1>" +
                        "<p class='nomargin'>Dec 1-4, 2 Guests<br/>$118 Expected Earning</p>";
                }
            }

            if (pointer.isAfter(event.start) && pointer.isBefore(event.end)) {

                divday.classList.add(this.CONFIGURATIONS.EVENT_CLASS);
                divday.dataset.event = this.events.length;

                if (this.CONFIGURATIONS.POPOVER) {

                    divday.id = "popover" + event.id;
                    divday.dataset.toggle = "popover";
                    divday.dataset.content = "<div class='text-right'><div class='bagde'>Checked In</div></div>" +
                        "<h1>Jane Fonda</h1>" +
                        "<p class='nomargin'>Dec 1-4, 2 Guests<br/>$118 Expected Earning</p>";
                }
            }

            if (divday.classList.contains(this.CONFIGURATIONS.CHECKOUT_CLASS) && divday.classList.contains(this.CONFIGURATIONS.CHECKIN_CLASS)) {

                divday.classList.remove(this.CONFIGURATIONS.EVENT_CLASS);
            }

            pointer.add(1, "days");
        }
    }

    this.events.push(event);

    if (this.CONFIGURATIONS.POPOVER) {

        this.calendarPopoverEngine.initPopovers();
    }
}


/*
 CalendarEvent
 */
CalendarEvent.prototype.start = null; //moment
CalendarEvent.prototype.end = null; //moment
CalendarEvent.prototype.id = null; //ID event

//Start YYYY-MM-dd
//End YYYY-MM-dd
function CalendarEvent (start, end, id) {

    if (typeof start == "undefined" || typeof end == "undefined" || typeof id == "undefined") {

        throw new Error("Invalid CalendarEvent argument")
    }

    var _start = moment(start);

    if (!_start.isValid()) {

        throw new Error("Invalid CalendarEvent start argument: date not valid")

    }

    var _end = moment(end);

    if (!_end.isValid()) {

        throw new Error("Invalid CalendarEvent end argument: date not valid")

    }

    this.start = _start;
    this.end = _end;
    this.id = id;

    return this;
}

/*
CalendarPopover
 */
CalendarPopoverEngine.prototype.initPopovers = function () {

    $('[data-toggle="popover"]').popover({
        trigger : "manual",
        //divday.dataset.template = "<div class='calendar-popover-content popover-content'></div>";
        placement : 'bottom',
        container : 'body',
        html : true,
        template: '<div class="popover popover-style-1" role="tooltip"><div class="popover-content"></div></div>',
        viewport : { selector: "#calendar", padding: 5 }
    });

    //for close other popover when one popover button click
    $(document).on("click", function(e){

        if (e.target.dataset.toggle == "popover") {

            $("[data-toggle='popover']").not(e.target).popover('hide');
            return;
        }

        $("[data-toggle='popover']").popover('hide');
    });

    //open popover when one popover div click
    $("[data-toggle='popover']").on("click" , function(){

        $(this).popover('show');
    });
}

CalendarPopoverEngine.prototype.closeAll = function () {

    $("[data-toggle='popover']").popover('hide');
}

function CalendarPopoverEngine () {

    return this;
}

