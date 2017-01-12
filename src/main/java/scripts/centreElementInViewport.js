/*
 * Method to scroll an element into the centre of the viewport
 */
$.fn.centreElementInViewport = function(){

    var elem_top = this.offset()['top'];
    var viewport_height = $(window).height();
    var scroll_amount = elem_top - (viewport_height / 2);
    $(window).scrollTop(scroll_amount);
};