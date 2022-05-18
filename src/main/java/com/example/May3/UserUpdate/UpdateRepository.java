package com.example.May3.UserUpdate;

import com.example.May3.Domain.CsoWalletModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UpdateRepository extends JpaRepository<CsoWalletModel, Long> {
    Optional<CsoWalletModel> findByResetPasswordToken(String resetPasswordToken);
    Optional<CsoWalletModel> findByUsername(String username);
    Optional<CsoWalletModel> findByEmail(String username);
}
