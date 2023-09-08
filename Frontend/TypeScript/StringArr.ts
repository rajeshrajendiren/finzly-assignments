let V:string[] =["RAM","raj","krish","Sethu","rajaseker","vignesh","Ranjith"]
V.forEach((value,i,arr)=>{
    console.log(value)
})

V.push("Vicky","Gokul","Akash","Kuber","Sitrarasan","rajesh","rakesh")

V.forEach((value,i,arr)=>{
    console.log(value)
})
V.pop()
V.forEach((value,i,arr)=>{
    console.log(value)
})