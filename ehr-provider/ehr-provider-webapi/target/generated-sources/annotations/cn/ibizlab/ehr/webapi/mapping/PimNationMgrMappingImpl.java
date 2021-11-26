package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimNationMgr;
import cn.ibizlab.ehr.webapi.dto.PimNationMgrDTO;
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
public class PimNationMgrMappingImpl implements PimNationMgrMapping {

    @Override
    public PimNationMgr toDomain(PimNationMgrDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimNationMgr pimNationMgr = new PimNationMgr();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimNationMgr.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimNationMgr.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrderno() != null ) {
            pimNationMgr.setOrderno( dto.getOrderno() );
        }
        if ( dto.getNationcode() != null ) {
            pimNationMgr.setNationcode( dto.getNationcode() );
        }
        if ( dto.getNationmgrname() != null ) {
            pimNationMgr.setNationmgrname( dto.getNationmgrname() );
        }
        if ( dto.getUpdateman() != null ) {
            pimNationMgr.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getNationmgrid() != null ) {
            pimNationMgr.setNationmgrid( dto.getNationmgrid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimNationMgr.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimNationMgr.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimNationMgr.setCreatedate( dto.getCreatedate() );
        }

        return pimNationMgr;
    }

    @Override
    public PimNationMgrDTO toDto(PimNationMgr entity) {
        if ( entity == null ) {
            return null;
        }

        PimNationMgrDTO pimNationMgrDTO = new PimNationMgrDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimNationMgrDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimNationMgrDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrderno() != null ) {
            pimNationMgrDTO.setOrderno( entity.getOrderno() );
        }
        if ( entity.getNationcode() != null ) {
            pimNationMgrDTO.setNationcode( entity.getNationcode() );
        }
        if ( entity.getNationmgrname() != null ) {
            pimNationMgrDTO.setNationmgrname( entity.getNationmgrname() );
        }
        if ( entity.getUpdateman() != null ) {
            pimNationMgrDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getNationmgrid() != null ) {
            pimNationMgrDTO.setNationmgrid( entity.getNationmgrid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimNationMgrDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimNationMgrDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimNationMgrDTO.setCreatedate( entity.getCreatedate() );
        }

        return pimNationMgrDTO;
    }

    @Override
    public List<PimNationMgr> toDomain(List<PimNationMgrDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimNationMgr> list = new ArrayList<PimNationMgr>( dtoList.size() );
        for ( PimNationMgrDTO pimNationMgrDTO : dtoList ) {
            list.add( toDomain( pimNationMgrDTO ) );
        }

        return list;
    }

    @Override
    public List<PimNationMgrDTO> toDto(List<PimNationMgr> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimNationMgrDTO> list = new ArrayList<PimNationMgrDTO>( entityList.size() );
        for ( PimNationMgr pimNationMgr : entityList ) {
            list.add( toDto( pimNationMgr ) );
        }

        return list;
    }
}
