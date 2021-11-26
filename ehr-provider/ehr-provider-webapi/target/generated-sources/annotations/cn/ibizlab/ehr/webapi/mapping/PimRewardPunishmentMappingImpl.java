package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimRewardPunishment;
import cn.ibizlab.ehr.webapi.dto.PimRewardPunishmentDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimRewardPunishmentMappingImpl implements PimRewardPunishmentMapping {

    @Override
    public PimRewardPunishment toDomain(PimRewardPunishmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimRewardPunishment pimRewardPunishment = new PimRewardPunishment();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimRewardPunishment.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimRewardPunishment.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getReason() != null ) {
            pimRewardPunishment.setReason( dto.getReason() );
        }
        if ( dto.getJlsj() != null ) {
            pimRewardPunishment.setJlsj( dto.getJlsj() );
        }
        if ( dto.getJlczz() != null ) {
            pimRewardPunishment.setJlczz( dto.getJlczz() );
        }
        if ( dto.getPimrewardpunishmentname() != null ) {
            pimRewardPunishment.setPimrewardpunishmentname( dto.getPimrewardpunishmentname() );
        }
        if ( dto.getDepartment() != null ) {
            pimRewardPunishment.setDepartment( dto.getDepartment() );
        }
        if ( dto.getBz() != null ) {
            pimRewardPunishment.setBz( dto.getBz() );
        }
        if ( dto.getJlspzt() != null ) {
            pimRewardPunishment.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getJlss() != null ) {
            pimRewardPunishment.setJlss( dto.getJlss() );
        }
        if ( dto.getJlglbh() != null ) {
            pimRewardPunishment.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getYxqjsrq() != null ) {
            pimRewardPunishment.setYxqjsrq( dto.getYxqjsrq() );
        }
        if ( dto.getJcjb() != null ) {
            pimRewardPunishment.setJcjb( dto.getJcjb() );
        }
        if ( dto.getCfsj() != null ) {
            pimRewardPunishment.setCfsj( dto.getCfsj() );
        }
        if ( dto.getJcje() != null ) {
            pimRewardPunishment.setJcje( dto.getJcje() );
        }
        if ( dto.getFj() != null ) {
            pimRewardPunishment.setFj( dto.getFj() );
        }
        if ( dto.getLx() != null ) {
            pimRewardPunishment.setLx( dto.getLx() );
        }
        if ( dto.getJcsj() != null ) {
            pimRewardPunishment.setJcsj( dto.getJcsj() );
        }
        if ( dto.getCsrq() != null ) {
            pimRewardPunishment.setCsrq( dto.getCsrq() );
        }
        if ( dto.getCflx() != null ) {
            pimRewardPunishment.setCflx( dto.getCflx() );
        }
        if ( dto.getJclx() != null ) {
            pimRewardPunishment.setJclx( dto.getJclx() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimRewardPunishment.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimRewardPunishment.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimRewardPunishment.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimRewardPunishment.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimRewardPunishment.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSpstate() != null ) {
            pimRewardPunishment.setSpstate( dto.getSpstate() );
        }
        if ( dto.getEnable() != null ) {
            pimRewardPunishment.setEnable( dto.getEnable() );
        }
        if ( dto.getOrgid() != null ) {
            pimRewardPunishment.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimrewardpunishmentid() != null ) {
            pimRewardPunishment.setPimrewardpunishmentid( dto.getPimrewardpunishmentid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimRewardPunishment.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimRewardPunishment.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            pimRewardPunishment.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimRewardPunishment.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimRewardPunishment.setPimpersonname( dto.getPimpersonname() );
        }

        return pimRewardPunishment;
    }

    @Override
    public PimRewardPunishmentDTO toDto(PimRewardPunishment entity) {
        if ( entity == null ) {
            return null;
        }

        PimRewardPunishmentDTO pimRewardPunishmentDTO = new PimRewardPunishmentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimRewardPunishmentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimRewardPunishmentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getReason() != null ) {
            pimRewardPunishmentDTO.setReason( entity.getReason() );
        }
        if ( entity.getJlsj() != null ) {
            pimRewardPunishmentDTO.setJlsj( entity.getJlsj() );
        }
        if ( entity.getJlczz() != null ) {
            pimRewardPunishmentDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getPimrewardpunishmentname() != null ) {
            pimRewardPunishmentDTO.setPimrewardpunishmentname( entity.getPimrewardpunishmentname() );
        }
        if ( entity.getDepartment() != null ) {
            pimRewardPunishmentDTO.setDepartment( entity.getDepartment() );
        }
        if ( entity.getBz() != null ) {
            pimRewardPunishmentDTO.setBz( entity.getBz() );
        }
        if ( entity.getJlspzt() != null ) {
            pimRewardPunishmentDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getJlss() != null ) {
            pimRewardPunishmentDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getJlglbh() != null ) {
            pimRewardPunishmentDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getYxqjsrq() != null ) {
            pimRewardPunishmentDTO.setYxqjsrq( entity.getYxqjsrq() );
        }
        if ( entity.getJcjb() != null ) {
            pimRewardPunishmentDTO.setJcjb( entity.getJcjb() );
        }
        if ( entity.getCfsj() != null ) {
            pimRewardPunishmentDTO.setCfsj( entity.getCfsj() );
        }
        if ( entity.getJcje() != null ) {
            pimRewardPunishmentDTO.setJcje( entity.getJcje() );
        }
        if ( entity.getFj() != null ) {
            pimRewardPunishmentDTO.setFj( entity.getFj() );
        }
        if ( entity.getLx() != null ) {
            pimRewardPunishmentDTO.setLx( entity.getLx() );
        }
        if ( entity.getJcsj() != null ) {
            pimRewardPunishmentDTO.setJcsj( entity.getJcsj() );
        }
        if ( entity.getCsrq() != null ) {
            pimRewardPunishmentDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getCflx() != null ) {
            pimRewardPunishmentDTO.setCflx( entity.getCflx() );
        }
        if ( entity.getJclx() != null ) {
            pimRewardPunishmentDTO.setJclx( entity.getJclx() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimRewardPunishmentDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimRewardPunishmentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimRewardPunishmentDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimRewardPunishmentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimRewardPunishmentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSpstate() != null ) {
            pimRewardPunishmentDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getEnable() != null ) {
            pimRewardPunishmentDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrgid() != null ) {
            pimRewardPunishmentDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimrewardpunishmentid() != null ) {
            pimRewardPunishmentDTO.setPimrewardpunishmentid( entity.getPimrewardpunishmentid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimRewardPunishmentDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimRewardPunishmentDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            pimRewardPunishmentDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimRewardPunishmentDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimRewardPunishmentDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimRewardPunishmentDTO;
    }

    @Override
    public List<PimRewardPunishment> toDomain(List<PimRewardPunishmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimRewardPunishment> list = new ArrayList<PimRewardPunishment>( dtoList.size() );
        for ( PimRewardPunishmentDTO pimRewardPunishmentDTO : dtoList ) {
            list.add( toDomain( pimRewardPunishmentDTO ) );
        }

        return list;
    }

    @Override
    public List<PimRewardPunishmentDTO> toDto(List<PimRewardPunishment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimRewardPunishmentDTO> list = new ArrayList<PimRewardPunishmentDTO>( entityList.size() );
        for ( PimRewardPunishment pimRewardPunishment : entityList ) {
            list.add( toDto( pimRewardPunishment ) );
        }

        return list;
    }
}
