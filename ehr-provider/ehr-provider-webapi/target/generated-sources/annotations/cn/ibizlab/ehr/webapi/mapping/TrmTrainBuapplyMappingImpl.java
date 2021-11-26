package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainBuapply;
import cn.ibizlab.ehr.webapi.dto.TrmTrainBuapplyDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainBuapplyMappingImpl implements TrmTrainBuapplyMapping {

    @Override
    public TrmTrainBuapply toDomain(TrmTrainBuapplyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainBuapply trmTrainBuapply = new TrmTrainBuapply();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainBuapply.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainBuapply.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJgfy() != null ) {
            trmTrainBuapply.setJgfy( dto.getJgfy() );
        }
        if ( dto.getBz() != null ) {
            trmTrainBuapply.setBz( dto.getBz() );
        }
        if ( dto.getTzje() != null ) {
            trmTrainBuapply.setTzje( dto.getTzje() );
        }
        if ( dto.getTrmtrainbuapplyname() != null ) {
            trmTrainBuapply.setTrmtrainbuapplyname( dto.getTrmtrainbuapplyname() );
        }
        if ( dto.getSzf() != null ) {
            trmTrainBuapply.setSzf( dto.getSzf() );
        }
        if ( dto.getNd() != null ) {
            trmTrainBuapply.setNd( dto.getNd() );
        }
        if ( dto.getClf() != null ) {
            trmTrainBuapply.setClf( dto.getClf() );
        }
        if ( dto.getQtfy() != null ) {
            trmTrainBuapply.setQtfy( dto.getQtfy() );
        }
        if ( dto.getCdzj() != null ) {
            trmTrainBuapply.setCdzj( dto.getCdzj() );
        }
        if ( dto.getYszje() != null ) {
            trmTrainBuapply.setYszje( dto.getYszje() );
        }
        if ( dto.getTzysxm() != null ) {
            trmTrainBuapply.setTzysxm( dto.getTzysxm() );
        }
        if ( dto.getJflx() != null ) {
            trmTrainBuapply.setJflx( dto.getJflx() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainBuapply.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmTrainBuapply.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getTrmtrainbuapplyid() != null ) {
            trmTrainBuapply.setTrmtrainbuapplyid( dto.getTrmtrainbuapplyid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainBuapply.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainBuapply.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainBuapply.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainBuapply.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainBuapply.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmTrainBuapply.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainBuapply.setOrmorgname( dto.getOrmorgname() );
        }

        return trmTrainBuapply;
    }

    @Override
    public TrmTrainBuapplyDTO toDto(TrmTrainBuapply entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainBuapplyDTO trmTrainBuapplyDTO = new TrmTrainBuapplyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainBuapplyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainBuapplyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJgfy() != null ) {
            trmTrainBuapplyDTO.setJgfy( entity.getJgfy() );
        }
        if ( entity.getBz() != null ) {
            trmTrainBuapplyDTO.setBz( entity.getBz() );
        }
        if ( entity.getTzje() != null ) {
            trmTrainBuapplyDTO.setTzje( entity.getTzje() );
        }
        if ( entity.getTrmtrainbuapplyname() != null ) {
            trmTrainBuapplyDTO.setTrmtrainbuapplyname( entity.getTrmtrainbuapplyname() );
        }
        if ( entity.getSzf() != null ) {
            trmTrainBuapplyDTO.setSzf( entity.getSzf() );
        }
        if ( entity.getNd() != null ) {
            trmTrainBuapplyDTO.setNd( entity.getNd() );
        }
        if ( entity.getClf() != null ) {
            trmTrainBuapplyDTO.setClf( entity.getClf() );
        }
        if ( entity.getQtfy() != null ) {
            trmTrainBuapplyDTO.setQtfy( entity.getQtfy() );
        }
        if ( entity.getCdzj() != null ) {
            trmTrainBuapplyDTO.setCdzj( entity.getCdzj() );
        }
        if ( entity.getYszje() != null ) {
            trmTrainBuapplyDTO.setYszje( entity.getYszje() );
        }
        if ( entity.getTzysxm() != null ) {
            trmTrainBuapplyDTO.setTzysxm( entity.getTzysxm() );
        }
        if ( entity.getJflx() != null ) {
            trmTrainBuapplyDTO.setJflx( entity.getJflx() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainBuapplyDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmTrainBuapplyDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getTrmtrainbuapplyid() != null ) {
            trmTrainBuapplyDTO.setTrmtrainbuapplyid( entity.getTrmtrainbuapplyid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainBuapplyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainBuapplyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainBuapplyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainBuapplyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainBuapplyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmTrainBuapplyDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainBuapplyDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return trmTrainBuapplyDTO;
    }

    @Override
    public List<TrmTrainBuapply> toDomain(List<TrmTrainBuapplyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainBuapply> list = new ArrayList<TrmTrainBuapply>( dtoList.size() );
        for ( TrmTrainBuapplyDTO trmTrainBuapplyDTO : dtoList ) {
            list.add( toDomain( trmTrainBuapplyDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainBuapplyDTO> toDto(List<TrmTrainBuapply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainBuapplyDTO> list = new ArrayList<TrmTrainBuapplyDTO>( entityList.size() );
        for ( TrmTrainBuapply trmTrainBuapply : entityList ) {
            list.add( toDto( trmTrainBuapply ) );
        }

        return list;
    }
}
