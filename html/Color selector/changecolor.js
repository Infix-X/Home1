const button =document.querySelectorAll('.button');
const body = document.querySelectorAll('body');
button.forEach(function(button) {

    console.log(button)

    button.addEventListener('click',function(e) {
        console.log(e);
        console.log(e.target);
        if(console.log.id ===  'grey'){
            body.style.backgroundColor = e.target.id;

        }
        if(console.log.id ===  'white'){
            body.style.backgroundColor = e.target.id;

        }
        if(console.log.id ===  'blue'){
            body.style.backgroundColor = e.target.id;

        }
        if(console.log.id ===  'yellow'){
            body.style.backgroundColor = e.target.id;

        }
});
});