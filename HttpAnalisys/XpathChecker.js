function getElementByXpath(path) {
  return document.evaluate(path, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;
}

path = "//*[@id='js_ox']/div/div/div[2]/div/div/div/div/span";

obj =  getElementByXpath(path);
console.log(obj);
obj.click();