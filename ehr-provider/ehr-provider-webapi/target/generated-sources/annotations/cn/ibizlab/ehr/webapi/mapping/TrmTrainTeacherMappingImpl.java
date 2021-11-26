package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainTeacher;
import cn.ibizlab.ehr.webapi.dto.TrmTrainTeacherDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainTeacherMappingImpl implements TrmTrainTeacherMapping {

    @Override
    public TrmTrainTeacher toDomain(TrmTrainTeacherDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainTeacher trmTrainTeacher = new TrmTrainTeacher();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainTeacher.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainTeacher.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZjkssj() != null ) {
            trmTrainTeacher.setZjkssj( dto.getZjkssj() );
        }
        if ( dto.getSfgx() != null ) {
            trmTrainTeacher.setSfgx( dto.getSfgx() );
        }
        if ( dto.getPxjsjb() != null ) {
            trmTrainTeacher.setPxjsjb( dto.getPxjsjb() );
        }
        if ( dto.getZp() != null ) {
            trmTrainTeacher.setZp( dto.getZp() );
        }
        if ( dto.getJf() != null ) {
            trmTrainTeacher.setJf( dto.getJf() );
        }
        if ( dto.getBz() != null ) {
            trmTrainTeacher.setBz( dto.getBz() );
        }
        if ( dto.getJslb() != null ) {
            trmTrainTeacher.setJslb( dto.getJslb() );
        }
        if ( dto.getJskc() != null ) {
            trmTrainTeacher.setJskc( dto.getJskc() );
        }
        if ( dto.getTz() != null ) {
            trmTrainTeacher.setTz( dto.getTz() );
        }
        if ( dto.getJsbm() != null ) {
            trmTrainTeacher.setJsbm( dto.getJsbm() );
        }
        if ( dto.getJslx() != null ) {
            trmTrainTeacher.setJslx( dto.getJslx() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmTrainTeacher.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getDj() != null ) {
            trmTrainTeacher.setDj( dto.getDj() );
        }
        if ( dto.getCjgs() != null ) {
            trmTrainTeacher.setCjgs( dto.getCjgs() );
        }
        if ( dto.getSffc() != null ) {
            trmTrainTeacher.setSffc( dto.getSffc() );
        }
        if ( dto.getPj() != null ) {
            trmTrainTeacher.setPj( dto.getPj() );
        }
        if ( dto.getNl() != null ) {
            trmTrainTeacher.setNl( dto.getNl() );
        }
        if ( dto.getXb() != null ) {
            trmTrainTeacher.setXb( dto.getXb() );
        }
        if ( dto.getZjhm() != null ) {
            trmTrainTeacher.setZjhm( dto.getZjhm() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmTrainTeacher.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getLxdh() != null ) {
            trmTrainTeacher.setLxdh( dto.getLxdh() );
        }
        if ( dto.getJglb() != null ) {
            trmTrainTeacher.setJglb( dto.getJglb() );
        }
        if ( dto.getAhtc() != null ) {
            trmTrainTeacher.setAhtc( dto.getAhtc() );
        }
        if ( dto.getDzyx() != null ) {
            trmTrainTeacher.setDzyx( dto.getDzyx() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainTeacher.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmTrainTeacher.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmTrainTeacher.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmtrainteacherid() != null ) {
            trmTrainTeacher.setTrmtrainteacherid( dto.getTrmtrainteacherid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainTeacher.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainTeacher.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainTeacher.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainTeacher.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainTeacher.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainTeacher.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainTeacher.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getZzdzs() != null ) {
            trmTrainTeacher.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getZw() != null ) {
            trmTrainTeacher.setZw( dto.getZw() );
        }

        return trmTrainTeacher;
    }

    @Override
    public TrmTrainTeacherDTO toDto(TrmTrainTeacher entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainTeacherDTO trmTrainTeacherDTO = new TrmTrainTeacherDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainTeacherDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainTeacherDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZjkssj() != null ) {
            trmTrainTeacherDTO.setZjkssj( entity.getZjkssj() );
        }
        if ( entity.getSfgx() != null ) {
            trmTrainTeacherDTO.setSfgx( entity.getSfgx() );
        }
        if ( entity.getPxjsjb() != null ) {
            trmTrainTeacherDTO.setPxjsjb( entity.getPxjsjb() );
        }
        if ( entity.getZp() != null ) {
            trmTrainTeacherDTO.setZp( entity.getZp() );
        }
        if ( entity.getJf() != null ) {
            trmTrainTeacherDTO.setJf( entity.getJf() );
        }
        if ( entity.getBz() != null ) {
            trmTrainTeacherDTO.setBz( entity.getBz() );
        }
        if ( entity.getJslb() != null ) {
            trmTrainTeacherDTO.setJslb( entity.getJslb() );
        }
        if ( entity.getJskc() != null ) {
            trmTrainTeacherDTO.setJskc( entity.getJskc() );
        }
        if ( entity.getTz() != null ) {
            trmTrainTeacherDTO.setTz( entity.getTz() );
        }
        if ( entity.getJsbm() != null ) {
            trmTrainTeacherDTO.setJsbm( entity.getJsbm() );
        }
        if ( entity.getJslx() != null ) {
            trmTrainTeacherDTO.setJslx( entity.getJslx() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmTrainTeacherDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getDj() != null ) {
            trmTrainTeacherDTO.setDj( entity.getDj() );
        }
        if ( entity.getCjgs() != null ) {
            trmTrainTeacherDTO.setCjgs( entity.getCjgs() );
        }
        if ( entity.getSffc() != null ) {
            trmTrainTeacherDTO.setSffc( entity.getSffc() );
        }
        if ( entity.getPj() != null ) {
            trmTrainTeacherDTO.setPj( entity.getPj() );
        }
        if ( entity.getNl() != null ) {
            trmTrainTeacherDTO.setNl( entity.getNl() );
        }
        if ( entity.getXb() != null ) {
            trmTrainTeacherDTO.setXb( entity.getXb() );
        }
        if ( entity.getZjhm() != null ) {
            trmTrainTeacherDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmTrainTeacherDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getLxdh() != null ) {
            trmTrainTeacherDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getJglb() != null ) {
            trmTrainTeacherDTO.setJglb( entity.getJglb() );
        }
        if ( entity.getAhtc() != null ) {
            trmTrainTeacherDTO.setAhtc( entity.getAhtc() );
        }
        if ( entity.getDzyx() != null ) {
            trmTrainTeacherDTO.setDzyx( entity.getDzyx() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainTeacherDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmTrainTeacherDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmTrainTeacherDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmtrainteacherid() != null ) {
            trmTrainTeacherDTO.setTrmtrainteacherid( entity.getTrmtrainteacherid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainTeacherDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainTeacherDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainTeacherDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainTeacherDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainTeacherDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainTeacherDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainTeacherDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getZzdzs() != null ) {
            trmTrainTeacherDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getZw() != null ) {
            trmTrainTeacherDTO.setZw( entity.getZw() );
        }

        return trmTrainTeacherDTO;
    }

    @Override
    public List<TrmTrainTeacher> toDomain(List<TrmTrainTeacherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainTeacher> list = new ArrayList<TrmTrainTeacher>( dtoList.size() );
        for ( TrmTrainTeacherDTO trmTrainTeacherDTO : dtoList ) {
            list.add( toDomain( trmTrainTeacherDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainTeacherDTO> toDto(List<TrmTrainTeacher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainTeacherDTO> list = new ArrayList<TrmTrainTeacherDTO>( entityList.size() );
        for ( TrmTrainTeacher trmTrainTeacher : entityList ) {
            list.add( toDto( trmTrainTeacher ) );
        }

        return list;
    }
}
