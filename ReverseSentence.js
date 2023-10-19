function reverseWordsWithoutBuiltIn(sentence) {
  const words = [];
  let wordStart = 0;

  for (let i = 0; i <= sentence.length; i++) {
    if (i === sentence.length || sentence[i] === ' ') {
      const word = sentence.substring(wordStart, i);
      const reversedWord = reverseString(word);
      words.push(reversedWord);
      wordStart = i + 1;
    }
  }

  return words.join(' ');
}

function reverseString(str) {
  let reversed = '';
  for (let i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
  }
  return reversed;
}

// Example usage
const inputSentence = "This is a sample sentence";
const reversedSentence = reverseWordsWithoutBuiltIn(inputSentence);
console.log(reversedSentence);
