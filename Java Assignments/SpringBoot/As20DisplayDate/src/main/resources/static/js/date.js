// two ways to meke the same alert:


//alert("This is the date template");


if (confirm("This is the " + document.title.toLocaleLowerCase() +" template")) {
  txt = "You pressed OK";
} else {
  txt = "You pressed Cancel";
}