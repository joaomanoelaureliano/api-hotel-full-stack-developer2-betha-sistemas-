import AbstractCrudService from "../abstract.crud.service";

export default class HospedeServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'https://reserva-facil-betha-sistemas.herokuapp.com/api/hospede')
  }

}

HospedeServico.$inject = ['$http']
