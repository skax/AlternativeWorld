package eu.hexgate.alternativeworld.domain.militarybase

import reactor.core.publisher.Mono

interface MilitaryBaseRepository {

    fun save(militaryBase: MilitaryBase): Mono<MilitaryBase>

    fun loadById(id: Long): Mono<MilitaryBase>

}