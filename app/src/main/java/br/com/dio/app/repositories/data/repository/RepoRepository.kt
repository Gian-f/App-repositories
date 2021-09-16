package br.com.dio.app.repositories.data.repository

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
   suspend fun ListRepositories(user: String) : Flow <List<Repo>>
}