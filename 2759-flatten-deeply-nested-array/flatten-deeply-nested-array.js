/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    function helper(a, depth) {
        let result = [];

        for (let item of a) {
            if (Array.isArray(item) && depth < n) {
                // Flatten one level deeper
                result.push(...helper(item, depth + 1));
            } else {
                result.push(item);
            }
        }

        return result;
    }

    return helper(arr, 0);
    
};