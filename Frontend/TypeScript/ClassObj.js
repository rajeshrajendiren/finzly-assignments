"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.person = void 0;
var person = /** @class */ (function () {
    function person(name, Aadhar, Acc) {
        this.name = name;
        this.bankAcc = Acc;
        this.Aadharno = Aadhar;
    }
    person.prototype.personDetail = function () {
        console.log("name:".concat(this.name, "\n                     bankAcc:").concat(this.bankAcc, " \n                     Aadharno:").concat(this.Aadharno));
    };
    return person;
}());
exports.person = person;
