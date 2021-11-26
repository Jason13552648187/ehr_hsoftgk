package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimAchievements;
import cn.ibizlab.ehr.webapi.dto.PimAchievementsDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimAchievementsMappingImpl implements PimAchievementsMapping {

    @Override
    public PimAchievements toDomain(PimAchievementsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimAchievements pimAchievements = new PimAchievements();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimAchievements.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimAchievements.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getEvaluationunit() != null ) {
            pimAchievements.setEvaluationunit( dto.getEvaluationunit() );
        }
        if ( dto.getKhdf() != null ) {
            pimAchievements.setKhdf( dto.getKhdf() );
        }
        if ( dto.getQsrq() != null ) {
            pimAchievements.setQsrq( dto.getQsrq() );
        }
        if ( dto.getKhjl() != null ) {
            pimAchievements.setKhjl( dto.getKhjl() );
        }
        if ( dto.getXmjb() != null ) {
            pimAchievements.setXmjb( dto.getXmjb() );
        }
        if ( dto.getJd() != null ) {
            pimAchievements.setJd( dto.getJd() );
        }
        if ( dto.getJsrq() != null ) {
            pimAchievements.setJsrq( dto.getJsrq() );
        }
        if ( dto.getDj() != null ) {
            pimAchievements.setDj( dto.getDj() );
        }
        if ( dto.getPimachievementsname() != null ) {
            pimAchievements.setPimachievementsname( dto.getPimachievementsname() );
        }
        if ( dto.getKhlx() != null ) {
            pimAchievements.setKhlx( dto.getKhlx() );
        }
        if ( dto.getYd() != null ) {
            pimAchievements.setYd( dto.getYd() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimAchievements.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimAchievements.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimAchievements.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimAchievements.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimAchievements.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pimAchievements.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimAchievements.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            pimAchievements.setEnable( dto.getEnable() );
        }
        if ( dto.getPimachievementsid() != null ) {
            pimAchievements.setPimachievementsid( dto.getPimachievementsid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimAchievements.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getYgbh() != null ) {
            pimAchievements.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimAchievements.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimAchievements.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }

        return pimAchievements;
    }

    @Override
    public PimAchievementsDTO toDto(PimAchievements entity) {
        if ( entity == null ) {
            return null;
        }

        PimAchievementsDTO pimAchievementsDTO = new PimAchievementsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimAchievementsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimAchievementsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getEvaluationunit() != null ) {
            pimAchievementsDTO.setEvaluationunit( entity.getEvaluationunit() );
        }
        if ( entity.getKhdf() != null ) {
            pimAchievementsDTO.setKhdf( entity.getKhdf() );
        }
        if ( entity.getQsrq() != null ) {
            pimAchievementsDTO.setQsrq( entity.getQsrq() );
        }
        if ( entity.getKhjl() != null ) {
            pimAchievementsDTO.setKhjl( entity.getKhjl() );
        }
        if ( entity.getXmjb() != null ) {
            pimAchievementsDTO.setXmjb( entity.getXmjb() );
        }
        if ( entity.getJd() != null ) {
            pimAchievementsDTO.setJd( entity.getJd() );
        }
        if ( entity.getJsrq() != null ) {
            pimAchievementsDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getDj() != null ) {
            pimAchievementsDTO.setDj( entity.getDj() );
        }
        if ( entity.getPimachievementsname() != null ) {
            pimAchievementsDTO.setPimachievementsname( entity.getPimachievementsname() );
        }
        if ( entity.getKhlx() != null ) {
            pimAchievementsDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getYd() != null ) {
            pimAchievementsDTO.setYd( entity.getYd() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimAchievementsDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimAchievementsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimAchievementsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimAchievementsDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimAchievementsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pimAchievementsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimAchievementsDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            pimAchievementsDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimachievementsid() != null ) {
            pimAchievementsDTO.setPimachievementsid( entity.getPimachievementsid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimAchievementsDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getYgbh() != null ) {
            pimAchievementsDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimAchievementsDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimAchievementsDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }

        return pimAchievementsDTO;
    }

    @Override
    public List<PimAchievements> toDomain(List<PimAchievementsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimAchievements> list = new ArrayList<PimAchievements>( dtoList.size() );
        for ( PimAchievementsDTO pimAchievementsDTO : dtoList ) {
            list.add( toDomain( pimAchievementsDTO ) );
        }

        return list;
    }

    @Override
    public List<PimAchievementsDTO> toDto(List<PimAchievements> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimAchievementsDTO> list = new ArrayList<PimAchievementsDTO>( entityList.size() );
        for ( PimAchievements pimAchievements : entityList ) {
            list.add( toDto( pimAchievements ) );
        }

        return list;
    }
}
