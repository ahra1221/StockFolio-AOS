package org.stockfolio.data.repository

import org.stockfolio.data.model.Sample
import org.stockfolio.domain.repository.SampleRepository
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor() : SampleRepository {
    override fun getSample(): Sample = Sample("test")
}