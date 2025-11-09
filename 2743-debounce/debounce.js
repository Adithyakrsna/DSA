/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timer; // stores the current timer reference
    
    return function(...args) {
        // If called again before time t, cancel the existing timer
        clearTimeout(timer);
        
        // Schedule a new execution after t milliseconds
        timer = setTimeout(() => {
            fn(...args);
        }, t);
    };
};
