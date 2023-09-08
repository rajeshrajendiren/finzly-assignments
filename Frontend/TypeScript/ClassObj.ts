export class person{
    name:string;
    Aadharno:number;
    bankAcc:number;

    constructor(name,Aadhar,Acc){
        this.name=name;
        this.bankAcc=Acc;
        this.Aadharno=Aadhar;

    }
    personDetail(){
        console.log(`name:${this.name}
                     bankAcc:${this.bankAcc} 
                     Aadharno:${this.Aadharno}`)
    }

}
