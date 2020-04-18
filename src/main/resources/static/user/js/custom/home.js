/*=========== Sticky Header ===========*/
function stickyHeader() {
    $(window).on('scroll', function () {
        var sticky_menu = $('.sticky__header');
        var pos = sticky_menu.position();
        if (sticky_menu.length) {
            var windowpos = sticky_menu.top;
            $(window).on('scroll', function () {
              var windowpos = $(window).scrollTop();
              if (windowpos > pos.top + 250) {
                sticky_menu.addClass('is-sticky');
              } else {
                sticky_menu.removeClass('is-sticky');
              }
        });
      }
    });
}
stickyHeader();
