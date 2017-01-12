/*
 * Method to determine if the end of the page has been reached
 * @return    True if the end of page has been reached, false otherwise
 */
function isEndOfPageReached(){
    return($(window).scrollTop() + $(window).height() == $(document).height());
};