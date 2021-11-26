package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimResearchFindings;
import cn.ibizlab.ehr.webapi.dto.PimResearchFindingsDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimResearchFindingsMappingImpl implements PimResearchFindingsMapping {

    @Override
    public PimResearchFindings toDomain(PimResearchFindingsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimResearchFindings pimResearchFindings = new PimResearchFindings();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimResearchFindings.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimResearchFindings.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJlglbh() != null ) {
            pimResearchFindings.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getPimresearchfindingsname() != null ) {
            pimResearchFindings.setPimresearchfindingsname( dto.getPimresearchfindingsname() );
        }
        if ( dto.getJlss() != null ) {
            pimResearchFindings.setJlss( dto.getJlss() );
        }
        if ( dto.getFj() != null ) {
            pimResearchFindings.setFj( dto.getFj() );
        }
        if ( dto.getJlspzt() != null ) {
            pimResearchFindings.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getHqsj() != null ) {
            pimResearchFindings.setHqsj( dto.getHqsj() );
        }
        if ( dto.getReason() != null ) {
            pimResearchFindings.setReason( dto.getReason() );
        }
        if ( dto.getJlczz() != null ) {
            pimResearchFindings.setJlczz( dto.getJlczz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimResearchFindings.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimResearchFindings.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimResearchFindings.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getEnable() != null ) {
            pimResearchFindings.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimResearchFindings.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimResearchFindings.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimResearchFindings.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimResearchFindings.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimresearchfindingsid() != null ) {
            pimResearchFindings.setPimresearchfindingsid( dto.getPimresearchfindingsid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimResearchFindings.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimResearchFindings.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimResearchFindings.setOrmorgid( dto.getOrmorgid() );
        }

        return pimResearchFindings;
    }

    @Override
    public PimResearchFindingsDTO toDto(PimResearchFindings entity) {
        if ( entity == null ) {
            return null;
        }

        PimResearchFindingsDTO pimResearchFindingsDTO = new PimResearchFindingsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimResearchFindingsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimResearchFindingsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJlglbh() != null ) {
            pimResearchFindingsDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getPimresearchfindingsname() != null ) {
            pimResearchFindingsDTO.setPimresearchfindingsname( entity.getPimresearchfindingsname() );
        }
        if ( entity.getJlss() != null ) {
            pimResearchFindingsDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getFj() != null ) {
            pimResearchFindingsDTO.setFj( entity.getFj() );
        }
        if ( entity.getJlspzt() != null ) {
            pimResearchFindingsDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getHqsj() != null ) {
            pimResearchFindingsDTO.setHqsj( entity.getHqsj() );
        }
        if ( entity.getReason() != null ) {
            pimResearchFindingsDTO.setReason( entity.getReason() );
        }
        if ( entity.getJlczz() != null ) {
            pimResearchFindingsDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimResearchFindingsDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimResearchFindingsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimResearchFindingsDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getEnable() != null ) {
            pimResearchFindingsDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimResearchFindingsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimResearchFindingsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimResearchFindingsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimResearchFindingsDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimresearchfindingsid() != null ) {
            pimResearchFindingsDTO.setPimresearchfindingsid( entity.getPimresearchfindingsid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimResearchFindingsDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimResearchFindingsDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimResearchFindingsDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimResearchFindingsDTO;
    }

    @Override
    public List<PimResearchFindings> toDomain(List<PimResearchFindingsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimResearchFindings> list = new ArrayList<PimResearchFindings>( dtoList.size() );
        for ( PimResearchFindingsDTO pimResearchFindingsDTO : dtoList ) {
            list.add( toDomain( pimResearchFindingsDTO ) );
        }

        return list;
    }

    @Override
    public List<PimResearchFindingsDTO> toDto(List<PimResearchFindings> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimResearchFindingsDTO> list = new ArrayList<PimResearchFindingsDTO>( entityList.size() );
        for ( PimResearchFindings pimResearchFindings : entityList ) {
            list.add( toDto( pimResearchFindings ) );
        }

        return list;
    }
}
