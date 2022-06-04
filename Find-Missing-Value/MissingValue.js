function findMissVal( ar ){

    let a = ar.length;
    let min  = Math.min(...ar)
    let max =Math.max(...ar);
    let tot = 0;

    let OriginalArray =[] ;
    
    for (let i = min; i <= max; i++) {
        OriginalArray.push(i);
    }
    
    let b = OriginalArray.length;

    if(a+1 == b){
        let missing = OriginalArray.filter(e=>!ar.includes(e))
        console.log("missing value: ",missing)
    }
    else{
        console.log("missing value is either first value: ",min-1," or last value: ", max+1)
    }

    
}

let val = [1,2,3,4,5,6]

findMissVal(val)