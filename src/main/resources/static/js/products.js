const products = [

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    },

    {
        productName : "this is name",
        productDetails : "this is product details",

    }


];

//
// <div className="card product">
//     <div className="card-body">
//         <h5 className="card-title">Card title</h5>
//         <h6 className="card-subtitle mb-2 text-muted">Card subtitle</h6>
//         <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's
//             content.</p>
//         <a href="#" className="card-link">Card link</a>
//         <a href="#" className="card-link">Another link</a>
//     </div>
// </div>
//

// selection

const productsElement = document.querySelector('.products');

function loadAllData(){

    for (let i=0; i<products.length; i++){
        console.log(products[i]);
    }

    // products.map(product => {
    //     console.log(product);
    // })
}

loadAllData();