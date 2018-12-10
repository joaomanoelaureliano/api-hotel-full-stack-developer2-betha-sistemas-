import AbstractCrudService from "../abstract.crud.service";

export default class ReservaServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'https://reserva-facil-betha-sistemas.herokuapp.com/api/reserva')
  }

}

ReservaServico.$inject = ['$http']
