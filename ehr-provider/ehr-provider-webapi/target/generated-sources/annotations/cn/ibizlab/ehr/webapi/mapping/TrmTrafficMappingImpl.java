package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTraffic;
import cn.ibizlab.ehr.webapi.dto.TrmTrafficDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrafficMappingImpl implements TrmTrafficMapping {

    @Override
    public TrmTraffic toDomain(TrmTrafficDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTraffic trmTraffic = new TrmTraffic();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTraffic.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTraffic.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJtfs() != null ) {
            trmTraffic.setJtfs( dto.getJtfs() );
        }
        if ( dto.getZm() != null ) {
            trmTraffic.setZm( dto.getZm() );
        }
        if ( dto.getTrmtrafficname() != null ) {
            trmTraffic.setTrmtrafficname( dto.getTrmtrafficname() );
        }
        if ( dto.getXlmc() != null ) {
            trmTraffic.setXlmc( dto.getXlmc() );
        }
        if ( dto.getCk() != null ) {
            trmTraffic.setCk( dto.getCk() );
        }
        if ( dto.getMdd() != null ) {
            trmTraffic.setMdd( dto.getMdd() );
        }
        if ( dto.getCfd() != null ) {
            trmTraffic.setCfd( dto.getCfd() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmTraffic.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getTrmtrafficid() != null ) {
            trmTraffic.setTrmtrafficid( dto.getTrmtrafficid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTraffic.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTraffic.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            trmTraffic.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTraffic.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTraffic.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmTraffic.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }

        return trmTraffic;
    }

    @Override
    public TrmTrafficDTO toDto(TrmTraffic entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrafficDTO trmTrafficDTO = new TrmTrafficDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrafficDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrafficDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJtfs() != null ) {
            trmTrafficDTO.setJtfs( entity.getJtfs() );
        }
        if ( entity.getZm() != null ) {
            trmTrafficDTO.setZm( entity.getZm() );
        }
        if ( entity.getTrmtrafficname() != null ) {
            trmTrafficDTO.setTrmtrafficname( entity.getTrmtrafficname() );
        }
        if ( entity.getXlmc() != null ) {
            trmTrafficDTO.setXlmc( entity.getXlmc() );
        }
        if ( entity.getCk() != null ) {
            trmTrafficDTO.setCk( entity.getCk() );
        }
        if ( entity.getMdd() != null ) {
            trmTrafficDTO.setMdd( entity.getMdd() );
        }
        if ( entity.getCfd() != null ) {
            trmTrafficDTO.setCfd( entity.getCfd() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmTrafficDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getTrmtrafficid() != null ) {
            trmTrafficDTO.setTrmtrafficid( entity.getTrmtrafficid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrafficDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrafficDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrafficDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrafficDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrafficDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmTrafficDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }

        return trmTrafficDTO;
    }

    @Override
    public List<TrmTraffic> toDomain(List<TrmTrafficDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTraffic> list = new ArrayList<TrmTraffic>( dtoList.size() );
        for ( TrmTrafficDTO trmTrafficDTO : dtoList ) {
            list.add( toDomain( trmTrafficDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrafficDTO> toDto(List<TrmTraffic> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrafficDTO> list = new ArrayList<TrmTrafficDTO>( entityList.size() );
        for ( TrmTraffic trmTraffic : entityList ) {
            list.add( toDto( trmTraffic ) );
        }

        return list;
    }
}
