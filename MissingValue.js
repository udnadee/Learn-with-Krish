function findMissVal( ar ){

    let a = ar.length;
    let min  = ar[0];
    let max = ar[0];
    let tot = 0;
   
    ar.forEach( i=>{
        tot += i;

        if(min > i){
            min = i
        }
        else if(max < i){
            max = i
        }
    })

    let OriginalArray =[] ;
    
    for (let i = min; i <= max; i++) {
        OriginalArray.push(i)
    }
    
    let b = OriginalArray.length;

    if(a+1 == b){
        let missing = OriginalArray.filter(e=>!ar.includes(e))
        console.log("missing value: ",missing)
    }
    else{
        console.log("missing value is either first value:",min-1," or last value:", max+1)
    }

    
}
