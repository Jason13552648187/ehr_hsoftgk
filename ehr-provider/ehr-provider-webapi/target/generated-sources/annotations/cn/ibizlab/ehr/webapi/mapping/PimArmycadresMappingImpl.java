package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArmycadres;
import cn.ibizlab.ehr.webapi.dto.PimArmycadresDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimArmycadresMappingImpl implements PimArmycadresMapping {

    @Override
    public PimArmycadres toDomain(PimArmycadresDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArmycadres pimArmycadres = new PimArmycadres();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArmycadres.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArmycadres.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimarmycadresname() != null ) {
            pimArmycadres.setPimarmycadresname( dto.getPimarmycadresname() );
        }
        if ( dto.getFj() != null ) {
            pimArmycadres.setFj( dto.getFj() );
        }
        if ( dto.getJlss() != null ) {
            pimArmycadres.setJlss( dto.getJlss() );
        }
        if ( dto.getJlspzt() != null ) {
            pimArmycadres.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getTrooptype() != null ) {
            pimArmycadres.setTrooptype( dto.getTrooptype() );
        }
        if ( dto.getLeveltype() != null ) {
            pimArmycadres.setLeveltype( dto.getLeveltype() );
        }
        if ( dto.getFssj() != null ) {
            pimArmycadres.setFssj( dto.getFssj() );
        }
        if ( dto.getReason() != null ) {
            pimArmycadres.setReason( dto.getReason() );
        }
        if ( dto.getJlczz() != null ) {
            pimArmycadres.setJlczz( dto.getJlczz() );
        }
        if ( dto.getJlglbh() != null ) {
            pimArmycadres.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimArmycadres.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArmycadres.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimArmycadres.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArmycadres.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimArmycadres.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArmycadres.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            pimArmycadres.setEnable( dto.getEnable() );
        }
        if ( dto.getPimarmycadresid() != null ) {
            pimArmycadres.setPimarmycadresid( dto.getPimarmycadresid() );
        }
        if ( dto.getCreateman() != null ) {
            pimArmycadres.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimArmycadres.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimArmycadres.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimArmycadres.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            pimArmycadres.setYgbh( dto.getYgbh() );
        }

        return pimArmycadres;
    }

    @Override
    public PimArmycadresDTO toDto(PimArmycadres entity) {
        if ( entity == null ) {
            return null;
        }

        PimArmycadresDTO pimArmycadresDTO = new PimArmycadresDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArmycadresDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArmycadresDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimarmycadresname() != null ) {
            pimArmycadresDTO.setPimarmycadresname( entity.getPimarmycadresname() );
        }
        if ( entity.getFj() != null ) {
            pimArmycadresDTO.setFj( entity.getFj() );
        }
        if ( entity.getJlss() != null ) {
            pimArmycadresDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getJlspzt() != null ) {
            pimArmycadresDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getTrooptype() != null ) {
            pimArmycadresDTO.setTrooptype( entity.getTrooptype() );
        }
        if ( entity.getLeveltype() != null ) {
            pimArmycadresDTO.setLeveltype( entity.getLeveltype() );
        }
        if ( entity.getFssj() != null ) {
            pimArmycadresDTO.setFssj( entity.getFssj() );
        }
        if ( entity.getReason() != null ) {
            pimArmycadresDTO.setReason( entity.getReason() );
        }
        if ( entity.getJlczz() != null ) {
            pimArmycadresDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getJlglbh() != null ) {
            pimArmycadresDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimArmycadresDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArmycadresDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimArmycadresDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArmycadresDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimArmycadresDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArmycadresDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            pimArmycadresDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimarmycadresid() != null ) {
            pimArmycadresDTO.setPimarmycadresid( entity.getPimarmycadresid() );
        }
        if ( entity.getCreateman() != null ) {
            pimArmycadresDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimArmycadresDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimArmycadresDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimArmycadresDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            pimArmycadresDTO.setYgbh( entity.getYgbh() );
        }

        return pimArmycadresDTO;
    }

    @Override
    public List<PimArmycadres> toDomain(List<PimArmycadresDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArmycadres> list = new ArrayList<PimArmycadres>( dtoList.size() );
        for ( PimArmycadresDTO pimArmycadresDTO : dtoList ) {
            list.add( toDomain( pimArmycadresDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArmycadresDTO> toDto(List<PimArmycadres> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArmycadresDTO> list = new ArrayList<PimArmycadresDTO>( entityList.size() );
        for ( PimArmycadres pimArmycadres : entityList ) {
            list.add( toDto( pimArmycadres ) );
        }

        return list;
    }
}
