
/**
 * @param {string} input
 * @return {string}
 */
var removeStars = function (input) {

    const result = [];
    for (let character of input) {
        if (character === '*') {
            result.pop();
        } else {
            result.push(character);
        }
    }
    return result.join('');
};
