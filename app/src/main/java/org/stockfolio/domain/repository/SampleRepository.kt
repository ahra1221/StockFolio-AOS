package org.stockfolio.domain.repository

import org.stockfolio.data.model.Sample

interface SampleRepository {
    fun getSample() : Sample
}